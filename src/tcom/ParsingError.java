/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcom;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

/**
 *
 * @author daniel
 */
public class ParsingError extends Exception {
    
    public ParsingError(String string) {
        super(string);
    }
}
