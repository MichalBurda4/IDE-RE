package parser;// Generated from /home/radek/agh_przedmioty/rok_III/StudioProjektowe1/Antlr4_Output/untitled/src/main/parser/parser.ucGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ucGrammar}.
 */
public interface ucGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ucGrammar#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ucGrammar.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ucGrammar.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#useCase}.
	 * @param ctx the parse tree
	 */
	void enterUseCase(ucGrammar.UseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#useCase}.
	 * @param ctx the parse tree
	 */
	void exitUseCase(ucGrammar.UseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ucID}.
	 * @param ctx the parse tree
	 */
	void enterUcID(ucGrammar.UcIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ucID}.
	 * @param ctx the parse tree
	 */
	void exitUcID(ucGrammar.UcIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ucName}.
	 * @param ctx the parse tree
	 */
	void enterUcName(ucGrammar.UcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ucName}.
	 * @param ctx the parse tree
	 */
	void exitUcName(ucGrammar.UcNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(ucGrammar.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(ucGrammar.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ioName}.
	 * @param ctx the parse tree
	 */
	void enterIoName(ucGrammar.IoNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ioName}.
	 * @param ctx the parse tree
	 */
	void exitIoName(ucGrammar.IoNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ioType}.
	 * @param ctx the parse tree
	 */
	void enterIoType(ucGrammar.IoTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ioType}.
	 * @param ctx the parse tree
	 */
	void exitIoType(ucGrammar.IoTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#io_TYPE}.
	 * @param ctx the parse tree
	 */
	void enterIo_TYPE(ucGrammar.Io_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#io_TYPE}.
	 * @param ctx the parse tree
	 */
	void exitIo_TYPE(ucGrammar.Io_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ucType}.
	 * @param ctx the parse tree
	 */
	void enterUcType(ucGrammar.UcTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ucType}.
	 * @param ctx the parse tree
	 */
	void exitUcType(ucGrammar.UcTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(ucGrammar.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(ucGrammar.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#alter_expanded}.
	 * @param ctx the parse tree
	 */
	void enterAlter_expanded(ucGrammar.Alter_expandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#alter_expanded}.
	 * @param ctx the parse tree
	 */
	void exitAlter_expanded(ucGrammar.Alter_expandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(ucGrammar.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(ucGrammar.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#notifyUser}.
	 * @param ctx the parse tree
	 */
	void enterNotifyUser(ucGrammar.NotifyUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#notifyUser}.
	 * @param ctx the parse tree
	 */
	void exitNotifyUser(ucGrammar.NotifyUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(ucGrammar.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(ucGrammar.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actors}.
	 * @param ctx the parse tree
	 */
	void enterActors(ucGrammar.ActorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actors}.
	 * @param ctx the parse tree
	 */
	void exitActors(ucGrammar.ActorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#primaryActor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryActor(ucGrammar.PrimaryActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#primaryActor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryActor(ucGrammar.PrimaryActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actorName}.
	 * @param ctx the parse tree
	 */
	void enterActorName(ucGrammar.ActorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actorName}.
	 * @param ctx the parse tree
	 */
	void exitActorName(ucGrammar.ActorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#paType}.
	 * @param ctx the parse tree
	 */
	void enterPaType(ucGrammar.PaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#paType}.
	 * @param ctx the parse tree
	 */
	void exitPaType(ucGrammar.PaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#secondaryActor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryActor(ucGrammar.SecondaryActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#secondaryActor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryActor(ucGrammar.SecondaryActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#saType}.
	 * @param ctx the parse tree
	 */
	void enterSaType(ucGrammar.SaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#saType}.
	 * @param ctx the parse tree
	 */
	void exitSaType(ucGrammar.SaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#pa_TYPE}.
	 * @param ctx the parse tree
	 */
	void enterPa_TYPE(ucGrammar.Pa_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#pa_TYPE}.
	 * @param ctx the parse tree
	 */
	void exitPa_TYPE(ucGrammar.Pa_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#sa_TYPE}.
	 * @param ctx the parse tree
	 */
	void enterSa_TYPE(ucGrammar.Sa_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#sa_TYPE}.
	 * @param ctx the parse tree
	 */
	void exitSa_TYPE(ucGrammar.Sa_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#preConditions}.
	 * @param ctx the parse tree
	 */
	void enterPreConditions(ucGrammar.PreConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#preConditions}.
	 * @param ctx the parse tree
	 */
	void exitPreConditions(ucGrammar.PreConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPrecondition(ucGrammar.PreconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPrecondition(ucGrammar.PreconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#statePre}.
	 * @param ctx the parse tree
	 */
	void enterStatePre(ucGrammar.StatePreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#statePre}.
	 * @param ctx the parse tree
	 */
	void exitStatePre(ucGrammar.StatePreContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ucGrammar.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ucGrammar.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#authe_pre}.
	 * @param ctx the parse tree
	 */
	void enterAuthe_pre(ucGrammar.Authe_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#authe_pre}.
	 * @param ctx the parse tree
	 */
	void exitAuthe_pre(ucGrammar.Authe_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#autho_pre}.
	 * @param ctx the parse tree
	 */
	void enterAutho_pre(ucGrammar.Autho_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#autho_pre}.
	 * @param ctx the parse tree
	 */
	void exitAutho_pre(ucGrammar.Autho_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#other_pre}.
	 * @param ctx the parse tree
	 */
	void enterOther_pre(ucGrammar.Other_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#other_pre}.
	 * @param ctx the parse tree
	 */
	void exitOther_pre(ucGrammar.Other_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#postConditions}.
	 * @param ctx the parse tree
	 */
	void enterPostConditions(ucGrammar.PostConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#postConditions}.
	 * @param ctx the parse tree
	 */
	void exitPostConditions(ucGrammar.PostConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#postCondition}.
	 * @param ctx the parse tree
	 */
	void enterPostCondition(ucGrammar.PostConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#postCondition}.
	 * @param ctx the parse tree
	 */
	void exitPostCondition(ucGrammar.PostConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#mainFlow}.
	 * @param ctx the parse tree
	 */
	void enterMainFlow(ucGrammar.MainFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#mainFlow}.
	 * @param ctx the parse tree
	 */
	void exitMainFlow(ucGrammar.MainFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actionBlockCreate}.
	 * @param ctx the parse tree
	 */
	void enterActionBlockCreate(ucGrammar.ActionBlockCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actionBlockCreate}.
	 * @param ctx the parse tree
	 */
	void exitActionBlockCreate(ucGrammar.ActionBlockCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actionBlockAlter}.
	 * @param ctx the parse tree
	 */
	void enterActionBlockAlter(ucGrammar.ActionBlockAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actionBlockAlter}.
	 * @param ctx the parse tree
	 */
	void exitActionBlockAlter(ucGrammar.ActionBlockAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#presentAlterSA}.
	 * @param ctx the parse tree
	 */
	void enterPresentAlterSA(ucGrammar.PresentAlterSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#presentAlterSA}.
	 * @param ctx the parse tree
	 */
	void exitPresentAlterSA(ucGrammar.PresentAlterSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actionBlockRead}.
	 * @param ctx the parse tree
	 */
	void enterActionBlockRead(ucGrammar.ActionBlockReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actionBlockRead}.
	 * @param ctx the parse tree
	 */
	void exitActionBlockRead(ucGrammar.ActionBlockReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#actionBlockErase}.
	 * @param ctx the parse tree
	 */
	void enterActionBlockErase(ucGrammar.ActionBlockEraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#actionBlockErase}.
	 * @param ctx the parse tree
	 */
	void exitActionBlockErase(ucGrammar.ActionBlockEraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#alternativeFlow}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeFlow(ucGrammar.AlternativeFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#alternativeFlow}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeFlow(ucGrammar.AlternativeFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#alternativeActionBlock}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeActionBlock(ucGrammar.AlternativeActionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#alternativeActionBlock}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeActionBlock(ucGrammar.AlternativeActionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#defaultActionBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultActionBlock(ucGrammar.DefaultActionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#defaultActionBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultActionBlock(ucGrammar.DefaultActionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#userInputData}.
	 * @param ctx the parse tree
	 */
	void enterUserInputData(ucGrammar.UserInputDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#userInputData}.
	 * @param ctx the parse tree
	 */
	void exitUserInputData(ucGrammar.UserInputDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#userSelectData}.
	 * @param ctx the parse tree
	 */
	void enterUserSelectData(ucGrammar.UserSelectDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#userSelectData}.
	 * @param ctx the parse tree
	 */
	void exitUserSelectData(ucGrammar.UserSelectDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#userGetInformation}.
	 * @param ctx the parse tree
	 */
	void enterUserGetInformation(ucGrammar.UserGetInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#userGetInformation}.
	 * @param ctx the parse tree
	 */
	void exitUserGetInformation(ucGrammar.UserGetInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#moveUser}.
	 * @param ctx the parse tree
	 */
	void enterMoveUser(ucGrammar.MoveUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#moveUser}.
	 * @param ctx the parse tree
	 */
	void exitMoveUser(ucGrammar.MoveUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#systemDataProcess}.
	 * @param ctx the parse tree
	 */
	void enterSystemDataProcess(ucGrammar.SystemDataProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#systemDataProcess}.
	 * @param ctx the parse tree
	 */
	void exitSystemDataProcess(ucGrammar.SystemDataProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#initialUA}.
	 * @param ctx the parse tree
	 */
	void enterInitialUA(ucGrammar.InitialUAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#initialUA}.
	 * @param ctx the parse tree
	 */
	void exitInitialUA(ucGrammar.InitialUAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#presentReadSA}.
	 * @param ctx the parse tree
	 */
	void enterPresentReadSA(ucGrammar.PresentReadSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#presentReadSA}.
	 * @param ctx the parse tree
	 */
	void exitPresentReadSA(ucGrammar.PresentReadSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#confirmEraseUA}.
	 * @param ctx the parse tree
	 */
	void enterConfirmEraseUA(ucGrammar.ConfirmEraseUAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#confirmEraseUA}.
	 * @param ctx the parse tree
	 */
	void exitConfirmEraseUA(ucGrammar.ConfirmEraseUAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#deleteSA}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSA(ucGrammar.DeleteSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#deleteSA}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSA(ucGrammar.DeleteSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#presentCreateSA}.
	 * @param ctx the parse tree
	 */
	void enterPresentCreateSA(ucGrammar.PresentCreateSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#presentCreateSA}.
	 * @param ctx the parse tree
	 */
	void exitPresentCreateSA(ucGrammar.PresentCreateSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#inputUA}.
	 * @param ctx the parse tree
	 */
	void enterInputUA(ucGrammar.InputUAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#inputUA}.
	 * @param ctx the parse tree
	 */
	void exitInputUA(ucGrammar.InputUAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#validate_inputSA}.
	 * @param ctx the parse tree
	 */
	void enterValidate_inputSA(ucGrammar.Validate_inputSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#validate_inputSA}.
	 * @param ctx the parse tree
	 */
	void exitValidate_inputSA(ucGrammar.Validate_inputSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#submitUA}.
	 * @param ctx the parse tree
	 */
	void enterSubmitUA(ucGrammar.SubmitUAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#submitUA}.
	 * @param ctx the parse tree
	 */
	void exitSubmitUA(ucGrammar.SubmitUAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#validateSA}.
	 * @param ctx the parse tree
	 */
	void enterValidateSA(ucGrammar.ValidateSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#validateSA}.
	 * @param ctx the parse tree
	 */
	void exitValidateSA(ucGrammar.ValidateSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#notifySA}.
	 * @param ctx the parse tree
	 */
	void enterNotifySA(ucGrammar.NotifySAContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#notifySA}.
	 * @param ctx the parse tree
	 */
	void exitNotifySA(ucGrammar.NotifySAContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#extended_by}.
	 * @param ctx the parse tree
	 */
	void enterExtended_by(ucGrammar.Extended_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#extended_by}.
	 * @param ctx the parse tree
	 */
	void exitExtended_by(ucGrammar.Extended_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(ucGrammar.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(ucGrammar.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#exceptions}.
	 * @param ctx the parse tree
	 */
	void enterExceptions(ucGrammar.ExceptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#exceptions}.
	 * @param ctx the parse tree
	 */
	void exitExceptions(ucGrammar.ExceptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(ucGrammar.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(ucGrammar.ExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ucGrammar#ioAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIoAttribute(ucGrammar.IoAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ucGrammar#ioAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIoAttribute(ucGrammar.IoAttributeContext ctx);
}