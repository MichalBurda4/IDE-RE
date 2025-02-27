// Generated from /home/radek/agh_przedmioty/rok_III/StudioProjektowe1/Antlr4_Output/untitled/src/main/antlr_output/parser.ucGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ucGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ucGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ucGrammar#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ucGrammar.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#useCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseCase(ucGrammar.UseCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ucID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcID(ucGrammar.UcIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ucName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcName(ucGrammar.UcNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo(ucGrammar.IoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ioName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoName(ucGrammar.IoNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ioType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoType(ucGrammar.IoTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#io_TYPE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_TYPE(ucGrammar.Io_TYPEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ucType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcType(ucGrammar.UcTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(ucGrammar.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#alter_expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_expanded(ucGrammar.Alter_expandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(ucGrammar.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#notify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify(ucGrammar.NotifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ucGrammar.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActors(ucGrammar.ActorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#primaryActor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryActor(ucGrammar.PrimaryActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorName(ucGrammar.ActorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#paType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaType(ucGrammar.PaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#secondaryActor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryActor(ucGrammar.SecondaryActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#saType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaType(ucGrammar.SaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#pa_TYPE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPa_TYPE(ucGrammar.Pa_TYPEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#sa_TYPE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSa_TYPE(ucGrammar.Sa_TYPEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#preConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreConditions(ucGrammar.PreConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecondition(ucGrammar.PreconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#statePre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatePre(ucGrammar.StatePreContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(ucGrammar.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#authe_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthe_pre(ucGrammar.Authe_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#autho_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutho_pre(ucGrammar.Autho_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#other_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_pre(ucGrammar.Other_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#postConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostConditions(ucGrammar.PostConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#postCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostCondition(ucGrammar.PostConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#mainFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFlow(ucGrammar.MainFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actionBlockCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionBlockCreate(ucGrammar.ActionBlockCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actionBlockAlter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionBlockAlter(ucGrammar.ActionBlockAlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#presentAlterSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresentAlterSA(ucGrammar.PresentAlterSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actionBlockRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionBlockRead(ucGrammar.ActionBlockReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#actionBlockErase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionBlockErase(ucGrammar.ActionBlockEraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#alternativeFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeFlow(ucGrammar.AlternativeFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#alternativeActionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeActionBlock(ucGrammar.AlternativeActionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#defaultActionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultActionBlock(ucGrammar.DefaultActionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#userInputData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserInputData(ucGrammar.UserInputDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#userSelectData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserSelectData(ucGrammar.UserSelectDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#userGetInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserGetInformation(ucGrammar.UserGetInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#moveUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveUser(ucGrammar.MoveUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#systemDataProcess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemDataProcess(ucGrammar.SystemDataProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#initialUA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialUA(ucGrammar.InitialUAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#presentReadSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresentReadSA(ucGrammar.PresentReadSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#confirmEraseUA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfirmEraseUA(ucGrammar.ConfirmEraseUAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#deleteSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSA(ucGrammar.DeleteSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#presentCreateSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresentCreateSA(ucGrammar.PresentCreateSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#inputUA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputUA(ucGrammar.InputUAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#validate_inputSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate_inputSA(ucGrammar.Validate_inputSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#submitUA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmitUA(ucGrammar.SubmitUAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#validateSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateSA(ucGrammar.ValidateSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#notifySA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifySA(ucGrammar.NotifySAContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#extended_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_by(ucGrammar.Extended_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(ucGrammar.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#exceptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptions(ucGrammar.ExceptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(ucGrammar.ExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ucGrammar#ioAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoAttribute(ucGrammar.IoAttributeContext ctx);
}