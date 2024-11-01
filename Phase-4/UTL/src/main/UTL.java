package main;

import main.ast.node.Program;
import main.compileError.CompileError;
import main.grammar.UTLLexer;
import main.grammar.UTLParser;
import main.visitor.astPrinter.ASTPrinter;
import main.visitor.codeGenerator.CodeGenerator;
import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.typeAnalyzer.TypeAnalyzer;
import org.antlr.v4.runtime.*;
import main.grammar.*;

import java.io.IOException;

public class UTL {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName("samples/sample-1.utl");
        UTLLexer lexer = new UTLLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UTLParser parser = new UTLParser(tokens);
        Program program = parser.program().pro;
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(program);
        TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
        typeAnalyzer.visit(program);
        if (!typeAnalyzer.typeErrors.isEmpty()){
            for(CompileError compileError: typeAnalyzer.typeErrors)
                System.out.println(compileError.getMessage());
        }
        else {
            CodeGenerator codeGenerator = new CodeGenerator(typeAnalyzer.typeErrors);
            program.accept(codeGenerator);
            System.out.println("Compiled Successfully!");
        }
    }
}
