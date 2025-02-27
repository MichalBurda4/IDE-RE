parser grammar ucGrammar;
options { tokenVocab=ucTokens; }


program
 : useCase
   description
   preConditions
   actors
   mainFlow
   alternativeFlow
   exceptions
   postConditions ;

useCase
 : ucID? ucName ;

ucID
 : UC INTEGER ;

ucName
 : ucType io ;

io
 : ioName ioType? ;

ioName
 : CAPITALIZED_NOUN | AUTHENTICATION ;

ioType
 : TYPE DOUBLE_QUOTATION_MARK io_TYPE DOUBLE_QUOTATION_MARK ;

io_TYPE : BUSINESS_ROLE | INANIMATE | PROCEDURE | DOCUMENT | EVENT | SITE | STATE;

ucType
 : CREATE | CREATES | CREATION | alter | read | DELETE | DELETES | notifyUser ;

alter
 : CORRECT | CORRECTS | alter_expanded ;

alter_expanded
 : CANCEL | CANCELS | ARCHIVE | ARCHIVES | COMPLETE | COMPLETES | VERB ;

read
 : READ | (READ REPORT (ABOUT | OF)) | READS | (READS REPORT (ABOUT | OF)) ;

notifyUser
 : (SEND | SENDS) NOTIFICATION (ABOUT (CREATION_2 | ALTERING_2 | READING_2 | ERASING_2))? OF? ;

description
 : DESCRIPTION COLON primaryActor ucName DOT (((secondaryActor) (AND secondaryActor)*) ((PROVIDES OR VERIFIES) | (PROVIDE OR VERIFY)) RELEVANT INFORMATION DOT)? (secondaryActor (AND secondaryActor)* (IS_AN_INTENDED_RECIPIENT | ARE_INTENDED_RECIPIENTS) io DOT)? ;

actors
 : (ACTORS | ACTORS_2) COLON primaryActor (COMMA secondaryActor)* ;

primaryActor
 : actorName paType? ;

actorName
 : CAPITALIZED_NOUN ;

paType
 : PAREN_OPEN TYPE COLON pa_TYPE PAREN_CLOSE ;

secondaryActor
 : actorName saType? ;

saType
 : PAREN_OPEN TYPE COLON sa_TYPE PAREN_CLOSE ;

pa_TYPE : CREATOR | ALTERER | EXPERIENCER;

sa_TYPE : ACCOMPANIMENT | INTENDED_RECIPIENT | NOTIFIEE;

preConditions
 : PRE_CONDITIONS COLON (INTEGER DOT precondition)* ;

precondition
 : statePre | authe_pre | autho_pre | other_pre ;

statePre
 : io IS_AT STATE state DOT TRIGGERED_BY useCase (COMMA useCase)* DOT ;

state
 : CANCELLED | PENDING | COMPLETE_STATE | CAPITALIZED_NOUN ;

authe_pre
 : primaryActor IS_AUTHENTICATED DOT ;

autho_pre
 : primaryActor IS_AUTHORIZED DOT ;

other_pre
 : IDENT ;

postConditions
 : POST_CONDITIONS COLON (INTEGER DOT postCondition)* ;

postCondition
 : io IS_AT STATE state DOT ;

mainFlow
 : MAIN FLOW COLON defaultActionBlock | actionBlockCreate | actionBlockAlter | actionBlockRead | actionBlockErase;

actionBlockCreate
 : initialUA
   (presentCreateSA extended_by? includes?)
   (inputUA extended_by*)+
   submitUA
   validateSA
   (notifySA includes?)? ;

actionBlockAlter
 : initialUA
   (presentAlterSA extended_by? includes?)
   (inputUA extended_by*)+
   submitUA
   validateSA
   (notifySA includes?)? ;

presentAlterSA : SA INTEGER DOT THE_SYSTEM_PROMPTS primaryActor TO_MODIFY THE io DOT;


actionBlockRead
 : initialUA
   presentReadSA
   (notifySA includes?)? ;

actionBlockErase
 : initialUA
   confirmEraseUA
   validateSA
   deleteSA
   (notifySA includes?)? ;











alternativeFlow : ALTERNATIVE FLOW COLON alternativeActionBlock;

alternativeActionBlock
	:
	(userGetInformation moveUser)* ;

defaultActionBlock
	:
	(((userInputData | userSelectData)+ systemDataProcess)+ userGetInformation)+ ;




userInputData : INTEGER DOT primaryActor A_START INPUT A_END (PARAMETER | PARAMETERS) CAPITALIZED_NOUN P_START (SMALL_NOUN (COMMA SMALL_NOUN)* ) P_END DOT;

userSelectData : INTEGER DOT primaryActor A_START SELECT A_END DATA OF LIST P_START (SMALL_NOUN (COMMA SMALL_NOUN)* ) P_END DOT;

userGetInformation : INTEGER DOT (INTEGER DOT)* primaryActor A_START DISPLAYS A_END P_START (SMALL_NOUN (COMMA SMALL_NOUN)* ) P_END DOT;

moveUser : INTEGER DOT (INTEGER DOT)* A_START MOVE A_END primaryActor TO P_START (( POINT INTEGER ) | MAIN_PAGE ) P_END DOT;

systemDataProcess : INTEGER DOT THE_SYSTEM A_START PROCESS A_END INPUTTED DATA CAPITALIZED_NOUN P_START SMALL_NOUN (COMMA SMALL_NOUN)* P_END DOT;









initialUA : UA INTEGER DOT primaryActor REQUESTS_TO ucName DOT;


//presentAlterSA : SA INTEGER DOT THE_SYSTEM_PROMPTS primaryActor TO_MODIFY THE io DOT;


presentReadSA : SA INTEGER DOT THE_SYSTEM DISPLAYS_INFORMATION_OF THE io DOT;

confirmEraseUA : UA INTEGER DOT primaryActor CONFIRMS_ERASE_OF THE io DOT;

deleteSA : SA INTEGER DOT THE_SYSTEM DELETE io DOT;



presentCreateSA : SA INTEGER DOT THE_SYSTEM_PROMPTS primaryActor TO_INPUT REQUIRED AND OPTIONAL ATTRIBUTE_VALUES OF? io DOT;

inputUA
 : UA INTEGER DOT primaryActor INPUT ioAttribute DOT (secondaryActor (PROVIDES | VERIFIES) THIS_INFORMATION DOT)?;

validate_inputSA : SA INTEGER DOT THE_SYSTEM VALIDATES ioAttribute DOT;

submitUA : UA INTEGER DOT primaryActor SUBMITS_THE_FORM OF? io DOT ;

validateSA : SA INTEGER DOT THE_SYSTEM VALIDATES_THE_ATTRIBUTES SUBMITTED_FORM DOT ;

notifySA : SA INTEGER DOT THE_SYSTEM notifyUser io TO_THE_FOLLOWING actors DOT ;

extended_by
 : LEFT_SQUARE_BRACKET EXTENSION_POINT DOT useCase RIGHT_SQUARE_BRACKET ;

includes
 : LEFT_SQUARE_BRACKET VIA useCase RIGHT_SQUARE_BRACKET ;

exceptions
 : EXCEPTIONS COLON (INTEGER DOT (INTEGER DOT)* exception)* ;

exception
 : ioAttribute (IS_INCORRECT | IS_INCORRECT_1 | IS_INCORRECT_2 ) COLON INVALID INPUT_DATA DOT ;

ioAttribute
 : P_START SMALL_NOUN P_END (OF?) io? ;
