package parser;// Generated from /home/radek/agh_przedmioty/rok_III/StudioProjektowe1/Antlr4_Output/untitled/src/main/antlr_output/parser.ucGrammar.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * This class provides an empty implementation of {@link ucGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class ucGrammarBaseListener implements ucGrammarListener {

	private ArrayList<Method> methods = new ArrayList<>();

	private ArrayList<Method> alterMethods = new ArrayList<>();

	private String ucName;

	private String javaCode = "";

	private String pythonCode = "";
	private String csCode = "";
	private String cppCode = "";

	public String getJavaCode(){
		return javaCode;
	}

	public String getPythonCode(){ return pythonCode; }

	public String getCsCode(){ return csCode; }

	public String getCppCode(){ return cppCode; }

	private String getIndent(int indentLevel) {
		return "\t".repeat(indentLevel);
	}

	private void addIf(ArrayList<Method> ifMethods, String condition, int indentLevel) {
		javaCode += "\n" + getIndent(indentLevel) + "if(" + condition + "){\n";
		csCode += "\n" + getIndent(indentLevel) + "if(" + condition + ")\n"+ getIndent(2) +"{\n";
		cppCode += "\n" + getIndent(indentLevel) + "if(" + condition + "){\n";
		pythonCode += "\n" + getIndent(indentLevel) + "if " + condition + ":\n";
		for(var ifMethod : ifMethods){
			javaCode += getIndent(indentLevel + 1) + ifMethod.name_ + "(" + ifMethod.params_ + ");\n";
			csCode += getIndent(indentLevel + 1) + ifMethod.name_ + "(" + ifMethod.params_ + ");\n";
			cppCode += getIndent(indentLevel + 1) + ifMethod.name_ + "(" + ifMethod.params_ + ");\n";
			pythonCode += getIndent(indentLevel + 1) + "self." + ifMethod.name_ + "(" + ifMethod.params_ + ")\n";
		}
		javaCode += getIndent(indentLevel + 1) + "return;\n";
		csCode += getIndent(indentLevel + 1) + "return;\n";
		cppCode += getIndent(indentLevel + 1) + "return;\n";
		pythonCode += getIndent(indentLevel + 1) + "return\n\n";

		javaCode += getIndent(indentLevel) + "}\n";
		csCode += getIndent(indentLevel) + "}\n";
		cppCode += getIndent(indentLevel) + "}\n";

	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	@Override public void enterProgram(ucGrammar.ProgramContext ctx) {
		if(ctx.useCase() != null) {
			ucName = ctx.useCase().ucName().io().ioName().CAPITALIZED_NOUN().getText();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(ucGrammar.ProgramContext ctx) {
		ArrayList<String> addedMethods = new ArrayList<>();
		ArrayList<String> addedParams = new ArrayList<>();

		javaCode += "public class " + ucName + " {\n\n";
		csCode += "public class " + ucName + " \n{\n";
		cppCode += "class " + ucName + " {\npublic:\n";
		pythonCode += "class " + ucName + ":\n\n";

		for(var method : methods){
			method.name_ = method.name_.replace(' ', '_');
		}

//		utowrzenie metod
		for(var method : methods) {
			if(addedMethods.contains(method.name_)) continue;
			javaCode += "\t"+ "public void " + method.name_ + "(String argument){}\n\n";
			csCode += "\t"+ "public void " + method.name_ + "(string argument){}\n\n";
			cppCode += "\t" + "void " + method.name_ + "(const std::string& argument){}\n\n";
			pythonCode += "\tdef " + method.name_ + "(self, argument):\n\t\tpass\n\n";
			addedMethods.add(method.name_);
		}

//		metoda run
		javaCode += "\tpublic void run(){\n\n";
		csCode += "\tpublic void run()\n\t{\n";
		cppCode += "\tvoid run(){\n";
		pythonCode += "\tdef run(self):\n";

//		utowrzenie parametrow
		javaCode += "\t\tString ";
		csCode += "\t\tstring ";
		for(var method : methods) {
			if(addedParams.contains(method.params_)) continue;
			javaCode += method.params_ + ", ";
			csCode += method.params_ + ", ";
			cppCode += "\t\tstd::string " + method.params_ + ";\n";
			pythonCode += "\t\t" + method.params_ + " = None\n";
			addedParams.add(method.params_);
		}
		javaCode = javaCode.substring(0, javaCode.length() - 2);
		csCode = csCode.substring(0, csCode.length() - 2);

		javaCode += ";\n\n";
		csCode += ";\n\n";
		cppCode += "\n";
		pythonCode += "\n";

		Set<Integer> alterMethodIndices = new HashSet<>();
		for(var method : alterMethods) {
			alterMethodIndices.add(Character.getNumericValue(method.point_.charAt(0)));
		}

		for(int i = 0; i < methods.size() - alterMethods.size(); i++) {
			if(alterMethodIndices.contains(Character.getNumericValue(methods.get(i).point_.charAt(0)))) {
				ArrayList<Method> ifMethods = new ArrayList<>();
				for(var alterMethod : alterMethods) {
					if(alterMethod.point_.charAt(0) == methods.get(i).point_.charAt(0)) {
						ifMethods.add(alterMethod);
					}
				}
				addIf(ifMethods, ifMethods.get(0).params_, 2);
			}
			javaCode += "\t\t" + methods.get(i).name_ + "(" + methods.get(i).params_ + ");\n";
			csCode += "\t\t" + methods.get(i).name_ + "(" + methods.get(i).params_ + ");\n";
			cppCode += "\t\t" + methods.get(i).name_ + "(" + methods.get(i).params_ + ");\n";
			pythonCode += "\t\tself." + methods.get(i).name_ + "(" + methods.get(i).params_ + ")\n";
		}
		javaCode += "\t}\n}";
		csCode += "\t}\n}";
		cppCode += "\t}\n}";

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUseCase(ucGrammar.UseCaseContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUseCase(ucGrammar.UseCaseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUcID(ucGrammar.UcIDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUcID(ucGrammar.UcIDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUcName(ucGrammar.UcNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUcName(ucGrammar.UcNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIo(ucGrammar.IoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIo(ucGrammar.IoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIoName(ucGrammar.IoNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIoName(ucGrammar.IoNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIoType(ucGrammar.IoTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIoType(ucGrammar.IoTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIo_TYPE(ucGrammar.Io_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIo_TYPE(ucGrammar.Io_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUcType(ucGrammar.UcTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUcType(ucGrammar.UcTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlter(ucGrammar.AlterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlter(ucGrammar.AlterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlter_expanded(ucGrammar.Alter_expandedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlter_expanded(ucGrammar.Alter_expandedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRead(ucGrammar.ReadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRead(ucGrammar.ReadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNotifyUser(ucGrammar.NotifyUserContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNotifyUser(ucGrammar.NotifyUserContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDescription(ucGrammar.DescriptionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDescription(ucGrammar.DescriptionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActors(ucGrammar.ActorsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActors(ucGrammar.ActorsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryActor(ucGrammar.PrimaryActorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryActor(ucGrammar.PrimaryActorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActorName(ucGrammar.ActorNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActorName(ucGrammar.ActorNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPaType(ucGrammar.PaTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPaType(ucGrammar.PaTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSecondaryActor(ucGrammar.SecondaryActorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryActor(ucGrammar.SecondaryActorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSaType(ucGrammar.SaTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSaType(ucGrammar.SaTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPa_TYPE(ucGrammar.Pa_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPa_TYPE(ucGrammar.Pa_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSa_TYPE(ucGrammar.Sa_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSa_TYPE(ucGrammar.Sa_TYPEContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPreConditions(ucGrammar.PreConditionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPreConditions(ucGrammar.PreConditionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrecondition(ucGrammar.PreconditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrecondition(ucGrammar.PreconditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatePre(ucGrammar.StatePreContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatePre(ucGrammar.StatePreContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterState(ucGrammar.StateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitState(ucGrammar.StateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAuthe_pre(ucGrammar.Authe_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAuthe_pre(ucGrammar.Authe_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAutho_pre(ucGrammar.Autho_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAutho_pre(ucGrammar.Autho_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOther_pre(ucGrammar.Other_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOther_pre(ucGrammar.Other_preContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostConditions(ucGrammar.PostConditionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostConditions(ucGrammar.PostConditionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostCondition(ucGrammar.PostConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostCondition(ucGrammar.PostConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMainFlow(ucGrammar.MainFlowContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMainFlow(ucGrammar.MainFlowContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActionBlockCreate(ucGrammar.ActionBlockCreateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActionBlockCreate(ucGrammar.ActionBlockCreateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActionBlockAlter(ucGrammar.ActionBlockAlterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActionBlockAlter(ucGrammar.ActionBlockAlterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPresentAlterSA(ucGrammar.PresentAlterSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPresentAlterSA(ucGrammar.PresentAlterSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActionBlockRead(ucGrammar.ActionBlockReadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActionBlockRead(ucGrammar.ActionBlockReadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActionBlockErase(ucGrammar.ActionBlockEraseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActionBlockErase(ucGrammar.ActionBlockEraseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlternativeFlow(ucGrammar.AlternativeFlowContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternativeFlow(ucGrammar.AlternativeFlowContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlternativeActionBlock(ucGrammar.AlternativeActionBlockContext ctx) {
		if(ctx.userGetInformation() != null) {

			for(var userGetInfo : ctx.userGetInformation()) {
				StringBuilder params = new StringBuilder();
				for(var object : userGetInfo.SMALL_NOUN()){
					params.append(object.toString()).append(", ");
				}
				if (!params.isEmpty()) {
					params.setLength(params.length() - 2);
				}
				StringBuilder order = new StringBuilder();
				for(var object : userGetInfo.INTEGER()){
					order.append(object.toString()).append(".");
				}

				Method alterMethod = new Method(userGetInfo.DISPLAYS().getText(), order.toString(), params.toString());
				alterMethods.add(alterMethod);
			}
		}
		if(ctx.moveUser() != null) {
			for(var moveUser : ctx.moveUser()) {
				String params;
				StringBuilder order = new StringBuilder();
				if(moveUser.MAIN_PAGE() != null){
					for(var object : moveUser.INTEGER()){
						order.append(object.toString()).append(".");
					}
					params = "strona_glowna";
				}
				else{
					for(int i = 0; i < moveUser.INTEGER().size() - 1; i++){
						order.append(moveUser.INTEGER().get(i).toString()).append(".");
					}
					params = moveUser.POINT()+ "_" + moveUser.INTEGER().get(moveUser.INTEGER().size() - 1).getText();
				}

				Method alterMethod = new Method(moveUser.MOVE().getText(), order.toString(), params);
				alterMethods.add(alterMethod);
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternativeActionBlock(ucGrammar.AlternativeActionBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefaultActionBlock(ucGrammar.DefaultActionBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefaultActionBlock(ucGrammar.DefaultActionBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUserInputData(ucGrammar.UserInputDataContext ctx) {
		StringBuilder params = new StringBuilder();
		for(var object : ctx.SMALL_NOUN()){
			params.append(object.toString()).append(", ");
		}
		if (!params.isEmpty()) {
			params.setLength(params.length() - 2);
		}

		Method newMethod = new Method(ctx.INPUT().getText(), ctx.INTEGER().getText()  + ".", params.toString());
		methods.add(newMethod);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUserInputData(ucGrammar.UserInputDataContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUserSelectData(ucGrammar.UserSelectDataContext ctx) {
		StringBuilder params = new StringBuilder();
		for(var object : ctx.SMALL_NOUN()){
			params.append(object.toString()).append(", ");
		}
		if (!params.isEmpty()) {
			params.setLength(params.length() - 2);
		}
		Method newMethod = new Method(ctx.SELECT().getText(), ctx.INTEGER().getText() + ".", params.toString());
		methods.add(newMethod);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUserSelectData(ucGrammar.UserSelectDataContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUserGetInformation(ucGrammar.UserGetInformationContext ctx) {
		StringBuilder params = new StringBuilder();
		for(var object : ctx.SMALL_NOUN()){
			params.append(object.toString()).append(", ");
		}
		if (!params.isEmpty()) {
			params.setLength(params.length() - 2);
		}
		StringBuilder order = new StringBuilder();
		for(var object : ctx.INTEGER()){
			order.append(object.toString()).append(".");
		}
		Method newMethod = new Method(ctx.DISPLAYS().getText(), order.toString(), params.toString());

		methods.add(newMethod);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUserGetInformation(ucGrammar.UserGetInformationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMoveUser(ucGrammar.MoveUserContext ctx) {
		String params;
		StringBuilder order = new StringBuilder();
		if(ctx.MAIN_PAGE() != null){
			for(var object : ctx.INTEGER()){
				order.append(object.toString()).append(".");
			}
			params = "strona_glowna";
		}
		else{
			for(int i = 0; i < ctx.INTEGER().size() - 1; i++){
				order.append(ctx.INTEGER().get(i).toString()).append(".");
			}
			params = ctx.POINT()+ "_" + ctx.INTEGER().get(ctx.INTEGER().size() - 1).getText();
		}
		Method newMethod = new Method(ctx.MOVE().getText(), order.toString(), params){};
		methods.add(newMethod);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMoveUser(ucGrammar.MoveUserContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSystemDataProcess(ucGrammar.SystemDataProcessContext ctx) {
		StringBuilder params = new StringBuilder();
		for(var object : ctx.SMALL_NOUN()){
			params.append(object.toString()).append(", ");
		}
		if (!params.isEmpty()) {
			params.setLength(params.length() - 2);
		}
		Method newMethod = new Method(ctx.PROCESS().getText(), ctx.INTEGER().getText()  + ".", params.toString());
		methods.add(newMethod);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSystemDataProcess(ucGrammar.SystemDataProcessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitialUA(ucGrammar.InitialUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitialUA(ucGrammar.InitialUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPresentReadSA(ucGrammar.PresentReadSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPresentReadSA(ucGrammar.PresentReadSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConfirmEraseUA(ucGrammar.ConfirmEraseUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConfirmEraseUA(ucGrammar.ConfirmEraseUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeleteSA(ucGrammar.DeleteSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeleteSA(ucGrammar.DeleteSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPresentCreateSA(ucGrammar.PresentCreateSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPresentCreateSA(ucGrammar.PresentCreateSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInputUA(ucGrammar.InputUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInputUA(ucGrammar.InputUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValidate_inputSA(ucGrammar.Validate_inputSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValidate_inputSA(ucGrammar.Validate_inputSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubmitUA(ucGrammar.SubmitUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSubmitUA(ucGrammar.SubmitUAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValidateSA(ucGrammar.ValidateSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValidateSA(ucGrammar.ValidateSAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNotifySA(ucGrammar.NotifySAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNotifySA(ucGrammar.NotifySAContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExtended_by(ucGrammar.Extended_byContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExtended_by(ucGrammar.Extended_byContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIncludes(ucGrammar.IncludesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIncludes(ucGrammar.IncludesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExceptions(ucGrammar.ExceptionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExceptions(ucGrammar.ExceptionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterException(ucGrammar.ExceptionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitException(ucGrammar.ExceptionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIoAttribute(ucGrammar.IoAttributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIoAttribute(ucGrammar.IoAttributeContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}