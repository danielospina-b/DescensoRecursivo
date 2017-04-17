/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2120166
 */
public class FileReader {
    public static TokenStack read() {
        TokenStack ts = null;
        try {
            BufferedReader in = new BufferedReader(new java.io.FileReader("entrada.txt"));
            String test = in.readLine();
            in.close();
            ts = new TokenStack(test);
        } catch (IOException ex) {
            System.out.println("Error I/O");
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ts;
    }
}
