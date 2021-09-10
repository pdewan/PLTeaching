package tests;

import main.lisp.parser.terms.AbstractSExpression;
import main.lisp.parser.terms.BasicExpression;
import main.lisp.parser.terms.SExpression;
import main.Main;

public class MySExpression extends BasicExpression{

	protected MySExpression(SExpression head, SExpression tail) {
		super(head, tail);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected String toStringAsListHelper() {
		SExpression anSExpression = getHead();
		AbstractSExpression aAbstractExpression = (AbstractSExpression) anSExpression;
		return null;
	}

}
