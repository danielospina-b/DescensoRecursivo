/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcom;

import java.util.Stack;

/**
 *
 * @author 2120166
 */
public class TokenStack {
    
    Stack stack;
    
    public TokenStack(String string) {
        stack = new Stack();
        char[] array = string.toCharArray();
        for (int x = array.length - 1; x >= 0; x--) {
            stack.push(array[x]); 
        }
    }
    
    public void sigToken() {
        stack.pop();
    }
}
