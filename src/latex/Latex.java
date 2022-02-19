/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latex;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author newac
 */
public class Latex {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        new home().setVisible(true);
        Scanner input = new Scanner(System.in);
        String code = "\\documentclass{article}";
        System.out.println("Enter Title: ");
        String title = input.nextLine();
        
        System.out.println("Enter Section: ");
        String section = input.nextLine();
        
        System.out.println("");
                
        code = code + '\n' + "\\title{" + title + "}";
        
        code = code + '\n' + "\\begin{document} "
                + " \n" + " \\maketitle " 
                + " \n" + " \\section{" + section + "}" 
                + " \n" + "\\end{document}";
                
        System.out.println(code);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("file1.tex", "UTF-8");
            writer.println(code);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



    }
    
}
