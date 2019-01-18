package com.nanimono.simpleoddb.executor;

import com.nanimono.simpleoddb.object.Type;
import com.nanimono.simpleoddb.object.TypeEnum;
import com.nanimono.simpleoddb.executor.antlr4.OddlGrammarBaseListener;
import com.nanimono.simpleoddb.executor.antlr4.OddlGrammarParser;

import java.util.List;

public class ExecutorListener extends OddlGrammarBaseListener {

    @Override
    public void exitCreateSourceClass(OddlGrammarParser.CreateSourceClassContext ctx) {
        String className = ctx.className().ID().getText();
        List<OddlGrammarParser.CreateDefinitionContext> list = ctx.createDefinitions().createDefinition();
        String[] definitions_name = new String[list.size()];
        Type[] definitions_type = new Type[definitions_name.length];
        for (int index = 0; index < definitions_name.length; index++) {
            OddlGrammarParser.CreateDefinitionContext current = list.get(index);
            definitions_name[index] = current.ID().getText();
            switch (current.dataType().children.get(0).getText()) {
                case "CHAR":
                    definitions_type[index] = new Type(TypeEnum.CHAR_TYPE);
                    definitions_type[index].setSize(Integer.parseInt(current.dataType().children.get(2).getText()));
                    break;

                case "INT":
                    definitions_type[index] = new Type(TypeEnum.INT_TYPE);
                    break;

                case "LONG":
                    definitions_type[index] = new Type(TypeEnum.LONG_TYPE);
                    break;

                case "FLOAT":
                    definitions_type[index] = new Type(TypeEnum.FLOAT_TYPE);
                    break;

                case "BOOLEAN":
                    definitions_type[index] = new Type(TypeEnum.BOOLEAN_TYPE);
                    break;
            }
        }

        System.out.println("CREATE CLASS " + className);
    }

    @Override
    public void exitCreateDeputyClass(OddlGrammarParser.CreateDeputyClassContext ctx) {
        String className = ctx.className().getText();
        String sClassName = ctx.sClassName().getText();
        String[] sAttr = new String[ctx.sAttr().size()];
        String[] dAttr = new String[ctx.dAttr().size()];
        for (int index = 0; index < sAttr.length; index++) {
            sAttr[index] = ctx.sAttr(index).getText();
            dAttr[index] = ctx.dAttr(index).getText();
        }

        // TODO: expression
    }

    @Override
    public void exitDropClass(OddlGrammarParser.DropClassContext ctx) {
        String className = ctx.className().getText();
    }

    @Override
    public void exitInsertIntoClass(OddlGrammarParser.InsertIntoClassContext ctx) {
        String className = ctx.className().getText();
        String[] valueList = new String[ctx.valueList().value().size()];
        for (int index = 0; index < valueList.length; index++) {
            valueList[index] = ctx.valueList().value(index).children.toString();
            System.out.println(valueList[index]);
        }
        // value in String Format
    }

    @Override
    public void exitDeleteFromClass(OddlGrammarParser.DeleteFromClassContext ctx) {
        String className = ctx.className().getText();

        // TODO: expression
    }

    @Override
    public void exitSimpleQuery(OddlGrammarParser.SimpleQueryContext ctx) {
        String className = ctx.className().getText();
        String[] attrList = new String[ctx.attrList().attrName().size()];
        for (int index = 0; index < attrList.length; index++) {
            attrList[index] = ctx.attrList().attrName(index).getText();
        }

        // TODO: expression
    }

    @Override
    public void exitCrossClassQuery(OddlGrammarParser.CrossClassQueryContext ctx) {
        String className = ctx.className(0).getText();
        String from_className = ctx.className(ctx.className().size() - 1).getText();
        String attrName = ctx.attrName().getText();
        String[] cross_classList = new String[ctx.className().size() - 2];
        for (int index = 0; index < cross_classList.length; index++) {
            cross_classList[index] = ctx.className(index + 1).getText();
        }

        // TODO: expression
    }
}
