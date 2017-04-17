/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcom;

import java.util.ArrayList;

/**
 *
 * @author 2120166
 */
public class Aritmetica {

    private TokenStack ts;
    private char token;
    
    private ArrayList<Character> C;
    private ArrayList<Character> E;
    private ArrayList<Character> T;
    
    public static final char fin = '$';
    
    public Aritmetica() {
        ts = FileReader.read();
        C = new ArrayList<>();
        E = new ArrayList<>();
        T = new ArrayList<>();
        C.add('>');
        C.add('<');
        C.add('=');
        E.add('+');
        E.add('-');
        T.add('/');
        T.add('*');
    }
    
    public static void main(String args[]) throws ParsingError {
        Aritmetica arit = new Aritmetica();
        arit.parse();
    }

    private void parse() throws ParsingError {
        sigToken();
        pC();
        expect(fin);
    }

    private void sigToken() {
        token = ts.sigToken();
    }

    private void pC() throws ParsingError {
        pE();
        if (C.contains(token)) {
            sigToken();
            pE();
        }
    }
    
    private void pE() throws ParsingError {
        pT();
        while (E.contains(token)) {
            sigToken();
            pT();
        }
    }
    
    private void pT() throws ParsingError {
        pF();
        while (T.contains(token)) {
            sigToken();
            pF();
        }
    }
    
    private void pF() throws ParsingError {
        if (token == 'a' | token == 'b' | token == 'c') {
            sigToken();
        }
        else if (token == '(') {
            sigToken();
            pE();
            expect(')');
        }
        else {
            throw new ParsingError("Expected 'a' or 'b' or 'c' or '(' but was: " + token);
        }
    }

    private void expect(char tok) throws ParsingError {
        if (token == tok) {
            if (tok == '$') {
                System.out.println("Fin de Expresion. Correcta");
            }
            else {
                sigToken();
            }
        }
        else {
            throw new ParsingError("Expected " + tok + " but was " + token);
        }
    }
}
