// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#createTree()} method.
*/
class ASTNode_2Test {

    /**
     * Test case for {@link ASTNode#createTree()}
     *
     * @see ASTNode#createTree()
     */
    @Test
    void testCreateTree() {
        ASTNode_2 ast = new ASTNode_2();
        ast.setNodeType("CompilationUnit");
        ast.setNodeName("CompilationUnit");
        ast.setNodeValue("CompilationUnit");
        ast.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast2 = new ASTNode_2();
        ast2.setNodeType("ImportDeclaration");
        ast2.setNodeName("ImportDeclaration");
        ast2.setNodeValue("ImportDeclaration");
        ast2.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast3 = new ASTNode_2();
        ast3.setNodeType("TypeDeclaration");
        ast3.setNodeName("TypeDeclaration");
        ast3.setNodeValue("TypeDeclaration");
        ast3.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast4 = new ASTNode_2();
        ast4.setNodeType("ClassOrInterfaceDeclaration");
        ast4.setNodeName("ClassOrInterfaceDeclaration");
        ast4.setNodeValue("ClassOrInterfaceDeclaration");
        ast4.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast5 = new ASTNode_2();
        ast5.setNodeType("EnumDeclaration");
        ast5.setNodeName("EnumDeclaration");
        ast5.setNodeValue("EnumDeclaration");
        ast5.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast6 = new ASTNode_2();
        ast6.setNodeType("AnnotationDeclaration");
        ast6.setNodeName("AnnotationDeclaration");
        ast6.setNodeValue("AnnotationDeclaration");
        ast6.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast7 = new ASTNode_2();
        ast7.setNodeType("FieldDeclaration");
        ast7.setNodeName("FieldDeclaration");
        ast7.setNodeValue("FieldDeclaration");
        ast7.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast8 = new ASTNode_2();
        ast8.setNodeType("MethodDeclaration");
        ast8.setNodeName("MethodDeclaration");
        ast8.setNodeValue("MethodDeclaration");
        ast8.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast9 = new ASTNode_2();
        ast9.setNodeType("ConstructorDeclaration");
        ast9.setNodeName("ConstructorDeclaration");
        ast9.setNodeValue("ConstructorDeclaration");
        ast9.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast10 = new ASTNode_2();
        ast10.setNodeType("EnumConstantDeclaration");
        ast10.setNodeName("EnumConstantDeclaration");
        ast10.setNodeValue("EnumConstantDeclaration");
        ast10.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast11 = new ASTNode_2();
        ast11.setNodeType("VariableDeclarator");
        ast11.setNodeName("VariableDeclarator");
        ast11.setNodeValue("VariableDeclarator");
        ast11.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast12 = new ASTNode_2();
        ast12.setNodeType("VariableDeclaratorId");
        ast12.setNodeName("VariableDeclaratorId");
        ast12.setNodeValue("VariableDeclaratorId");
        ast12.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast13 = new ASTNode_2();
        ast13.setNodeType("BlockStatement");
        ast13.setNodeName("BlockStatement");
        ast13.setNodeValue("BlockStatement");
        ast13.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast14 = new ASTNode_2();
        ast14.setNodeType("LocalVariableDeclarationStatement");
        ast14.setNodeName("LocalVariableDeclarationStatement");
        ast14.setNodeValue("LocalVariableDeclarationStatement");
        ast14.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast15 = new ASTNode_2();
        ast15.setNodeType("Statement");
        ast15.setNodeName("Statement");
        ast15.setNodeValue("Statement");
        ast15.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast16 = new ASTNode_2();
        ast16.setNodeType("IfStatement");
        ast16.setNodeName("IfStatement");
        ast16.setNodeValue("IfStatement");
        ast16.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast17 = new ASTNode_2();
        ast17.setNodeType("WhileStatement");
        ast17.setNodeName("WhileStatement");
        ast17.setNodeValue("WhileStatement");
        ast17.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast18 = new ASTNode_2();
        ast18.setNodeType("ForStatement");
        ast18.setNodeName("ForStatement");
        ast18.setNodeValue("ForStatement");
        ast18.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast19 = new ASTNode_2();
        ast19.setNodeType("ExpressionStatement");
        ast19.setNodeName("ExpressionStatement");
        ast19.setNodeValue("ExpressionStatement");
        ast19.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast20 = new ASTNode_2();
        ast20.setNodeType("BreakStatement");
        ast20.setNodeName("BreakStatement");
        ast20.setNodeValue("BreakStatement");
        ast20.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast21 = new ASTNode_2();
        ast21.setNodeType("ReturnStatement");
        ast21.setNodeName("ReturnStatement");
        ast21.setNodeValue("ReturnStatement");
        ast21.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast22 = new ASTNode_2();
        ast22.setNodeType("ThrowStatement");
        ast22.setNodeName("ThrowStatement");
        ast22.setNodeValue("ThrowStatement");
        ast22.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast23 = new ASTNode_2();
        ast23.setNodeType("SynchronizedStatement");
        ast23.setNodeName("SynchronizedStatement");
        ast23.setNodeValue("SynchronizedStatement");
        ast23.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast24 = new ASTNode_2();
        ast24.setNodeType("TryStatement");
        ast24.setNodeName("TryStatement");
        ast24.setNodeValue("TryStatement");
        ast24.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast25 = new ASTNode_2();
        ast25.setNodeType("CatchClause");
        ast25.setNodeName("CatchClause");
        ast25.setNodeValue("CatchClause");
        ast25.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast26 = new ASTNode_2();
        ast26.setNodeType("SwitchStatement");
        ast26.setNodeName("SwitchStatement");
        ast26.setNodeValue("SwitchStatement");
        ast26.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast27 = new ASTNode_2();
        ast27.setNodeType("SwitchCase");
        ast27.setNodeName("SwitchCase");
        ast27.setNodeValue("SwitchCase");
        ast27.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast28 = new ASTNode_2();
        ast28.setNodeType("Type");
        ast28.setNodeName("Type");
        ast28.setNodeValue("Type");
        ast28.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast29 = new ASTNode_2();
        ast29.setNodeType("PrimitiveType");
        ast29.setNodeName("PrimitiveType");
        ast29.setNodeValue("PrimitiveType");
        ast29.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast30 = new ASTNode_2();
        ast30.setNodeType("ReferenceType");
        ast30.setNodeName("ReferenceType");
        ast30.setNodeValue("ReferenceType");
        ast30.setNodeChildren(new ArrayList<ASTNode_2>());
        ASTNode_2 ast31 = new