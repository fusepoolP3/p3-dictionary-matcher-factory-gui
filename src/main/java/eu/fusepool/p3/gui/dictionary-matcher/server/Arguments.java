package eu.fusepool.p3.gui.dictionarymatcher.server;

import org.wymiwyg.commons.util.arguments.ArgumentsWithHelp;
import org.wymiwyg.commons.util.arguments.CommandLine;

public interface Arguments extends ArgumentsWithHelp {
    
    @CommandLine(longName = "port", shortName = {"P"}, required = false,
            defaultValue = "8202",
            description = "The port on which the dictionary-matcher tranformer factory shall listen")
    public int getPort();
    
}
