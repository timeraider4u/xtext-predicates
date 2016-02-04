/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.kefax.kbuild.formatting2

import at.jku.weiner.kefax.kbuild.kbuild.BuildEntry
import at.jku.weiner.kefax.kbuild.kbuild.Entry
import at.jku.weiner.kefax.kbuild.kbuild.HostProgram
import at.jku.weiner.kefax.kbuild.kbuild.If
import at.jku.weiner.kefax.kbuild.kbuild.IfEq
import at.jku.weiner.kefax.kbuild.kbuild.IfNEq
import at.jku.weiner.kefax.kbuild.kbuild.Ifndef
import at.jku.weiner.kefax.kbuild.kbuild.Model
import at.jku.weiner.kefax.kbuild.kbuild.MyVariable
import at.jku.weiner.kefax.kbuild.kbuild.Obj_m
import at.jku.weiner.kefax.kbuild.kbuild.Obj_y
import at.jku.weiner.kefax.kbuild.kbuild.ObjectShellCmd
import at.jku.weiner.kefax.kbuild.kbuild.ObjectVariable
import at.jku.weiner.kefax.kbuild.kbuild.ShellCmd
import at.jku.weiner.kefax.kbuild.kbuild.ShellPart
import at.jku.weiner.kefax.kbuild.kbuild.Target
import at.jku.weiner.kefax.kbuild.kbuild.Value
import at.jku.weiner.kefax.kbuild.kbuild.Values
import at.jku.weiner.kefax.kbuild.services.KbuildGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class KbuildFormatter extends AbstractFormatter2 {
	
	@Inject extension KbuildGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (BuildEntry buildEntry : model.getBuildEntry()) {
			format(buildEntry, document);
		}
	}

	def dispatch void format(BuildEntry buildEntry, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(buildEntry.getValue(), document);
	}

	def dispatch void format(IfEq ifEq, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(ifEq.getValue(), document);
	}

	def dispatch void format(IfNEq ifNEq, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(ifNEq.getValue(), document);
	}

	def dispatch void format(Ifndef ifndef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(ifndef.getValue(), document);
	}

	def dispatch void format(HostProgram hostProgram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(hostProgram.getVariable(), document);
		format(hostProgram.getValue(), document);
		format(hostProgram.getInner(), document);
	}

	def dispatch void format(at.jku.weiner.kefax.kbuild.kbuild.Object object, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(object.getValue(), document);
	}

	def dispatch void format(Target target, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(target.getTarget(), document);
		for (Values values : target.getValues()) {
			format(values, document);
		}
	}

	def dispatch void format(MyVariable myVariable, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(myVariable.getVariable(), document);
		format(myVariable.getValue(), document);
	}

	def dispatch void format(Entry entry, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(entry.getVariable(), document);
		format(entry.getValue(), document);
	}

	def dispatch void format(If _if, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(_if.getShell(), document);
		format(_if.getValue(), document);
		format(_if.getElsevalue(), document);
	}

	def dispatch void format(Obj_y obj_y, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(obj_y.getValue(), document);
	}

	def dispatch void format(Obj_m obj_m, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(obj_m.getValue(), document);
	}

	def dispatch void format(Values values, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Value items : values.getItems()) {
			format(items, document);
		}
	}

	def dispatch void format(ObjectVariable objectVariable, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(objectVariable.getValue(), document);
	}

	def dispatch void format(ObjectShellCmd objectShellCmd, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(objectShellCmd.getValue(), document);
	}

	def dispatch void format(ShellCmd shellCmd, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ShellPart shellPart : shellCmd.getShellPart()) {
			format(shellPart, document);
		}
	}

	def dispatch void format(ShellPart shellPart, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(shellPart.getVal(), document);
		format(shellPart.getCmd(), document);
	}
}
