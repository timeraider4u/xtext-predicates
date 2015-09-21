/**
 * generated by Xtext 2.9.0.v201509120608
 */
package org.xtext.example.mydsl1.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl1.myDsl.Greeting;
import org.xtext.example.mydsl1.myDsl.Model;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Greeting> _greetings = model.getGreetings();
    for (final Greeting greetings : _greetings) {
      this.format(greetings, document);
    }
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
