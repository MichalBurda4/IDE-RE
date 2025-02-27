lexer grammar ucTokens;

UC : 'UC';

PRESS : 'wciska';

BUTTON : 'przycisk';

PARAMETER : 'parametr';

PARAMETERS : 'parametery';

SELECT : 'wybiera';

DATA : 'dane';

DATA_2 : 'danych';

LIST : 'listy';

DISPLAYS_INFORMATION_OF_2 : 'wyswietla sie informacja o';

ALTERNATIVE : 'Alternatywny';

MOVE : 'Przeniesienie';

TO : 'do';

POINT : 'punktu';

PROCESS : 'przetwarza';

INPUTTED : 'wprowadzone';

DISPLAYS : 'wyswietla sie';

RN_START : '<rozszerzenie nazwy>';

RN_END : '</rn>';

A_START : '<aktywnosc>';

A_END : '</a>';

P_START : '<parametr>';

P_END : '</p>';

MAIN_PAGE : 'strony startowej';




AUTHENTICATION : 'Uwierzytelnianie';

TYPE : 'typ';

DOUBLE_QUOTATION_MARK : '"';

BUSINESS_ROLE : 'rola biznesowa';

INANIMATE : 'nieozywiony';

PROCEDURE : 'procedura';

DOCUMENT : 'dokument';

EVENT : 'zdarzenie';

SITE : 'miejsce';

STATE : 'stanie';

CREATE : 'utworz';

CREATES : 'tworzy';

DELETE : 'usun';

DELETES : 'usuwa';

CORRECT : 'popraw';

CORRECTS : 'poprawia';

CANCEL : 'anuluj';

CANCELS : 'anuluje';

ARCHIVE : 'archiwizuj';

ARCHIVES : 'archiwizuje';

COMPLETE : 'zakoncz';

COMPLETES : 'zakoncza';

READ : 'odczytaj';

REPORT : 'raport';

ABOUT : 'o';

READS : 'odczytuje';

SEND : 'wyslij';

SENDS : 'wysyla';

NOTIFICATION : 'powiadomienie';

THE : 'ten';

CREATION : 'utworzenie';

CREATION_2 : 'utworzeniu';

ALTERING : 'modyfikacja';

ALTERING_2 : 'modyfikacji';

READING : 'odczytywanie';

READING_2 : 'odczytywaniu';

ERASING : 'usuwanie';

ERASING_2 : 'usuwaniu';

OF : 'z';

DESCRIPTION : 'Opis';

DOT : '.';

COLON : ':';

AND : 'oraz';

PROVIDES : 'dostarcza';

OR : 'lub';

VERIFIES : 'weryfikuje';

PROVIDE : 'dostarcz';

VERIFY : 'zweryfikuj';

RELEVANT : 'istotne';

INFORMATION : 'informacje';

IS_AN_INTENDED_RECIPIENT : 'jest zamierzonym odbiorca';

ARE_INTENDED_RECIPIENTS : 'sa zamierzonymi odbiorcami';

ACTORS : 'Aktorzy';

ACTORS_2 : 'Aktorow';

COMMA : ',';

PAREN_OPEN : '(';

PAREN_CLOSE : ')';

CREATOR : 'tworca';

ALTERER : 'modyfikujacy';

EXPERIENCER : 'doswiadczajacy';

ACCOMPANIMENT : 'towarzyszacy';

INTENDED_RECIPIENT : 'zamierzony odbiorca';

NOTIFIEE : 'powiadamiany';

PRE_CONDITIONS : 'Warunki wstepne';

TRIGGERED_BY : 'Uruchomiony przez';

IS_AT : 'jest w';

CANCELLED : 'Anulowany';

PENDING : 'Oczekujacy';

COMPLETE_STATE : 'Zakonczony';

IS_AUTHENTICATED : 'jest uwierzytelniony';

IS_AUTHORIZED : 'jest upowazniony';

POST_CONDITIONS : 'Warunki koncowe';

MAIN : 'Glowny';

FLOW : 'Przeplyw';

UA : 'UA';

REQUESTS_TO : 'zadaje';

SA : 'SA';

THE_SYSTEM_PROMPTS : 'System sklania';

TO_INPUT : 'do wprowadzenia';

REQUIRED : 'wymaganych';

OPTIONAL : 'opcjonalnych';

ATTRIBUTE_VALUES : 'wartosci atrybutow';

OF_THE : 'formularza';

INPUT : 'wprowadza';

THIS_INFORMATION : 'te informacje';

SUBMITS_THE_FORM : 'przesyla formularz';

THE_SYSTEM : 'System';

VALIDATES_THE_ATTRIBUTES : 'weryfikuje atrybuty';

SUBMITTED_FORM : 'przeslanego formularza';

SAVES_THE_FORM : 'zapisuje formularz';

TO_THE_FOLLOWING : 'do nastepujacych';

LEFT_SQUARE_BRACKET : '[';

RIGHT_SQUARE_BRACKET : ']';

EXTENSION_POINT : 'Punkt rozszerzenia';

VIA : 'za posrednictwem';

EXCEPTIONS : 'Wyjatki';

IS_INCORRECT : 'jest niepoprawny';

IS_INCORRECT_1 : 'jest niepoprawna';

IS_INCORRECT_2 : 'jest niepoprawne';

INVALID : 'Nieprawidlowe';

DISPLAYS_INFORMATION_OF : 'wyswietla informacje o';


TO_MODIFY : 'do zmiany';

CONFIRMS_ERASE_OF : 'potwierdza usuniecie';

VALIDATES : 'waliduje';

INPUT_DATA : 'dane wejsciowe';

INTEGER : [0-9]+ ;

CAPITALIZED_NOUN : [A-Z] [a-zA-Z_]* [0-9]* ;

SMALL_NOUN : [a-z] [a-z_]* ;

VERB : [a-zA-Z]+ ;

IDENT : [a-zA-Z_] [a-zA-Z_0-9]* ;

WS  : [ \t\r\n]+ -> skip ;
