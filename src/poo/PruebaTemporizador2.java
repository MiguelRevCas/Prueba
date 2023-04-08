package poo;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import  java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
	

		Reloj mireloj=new Reloj();
		mireloj.enMarcha(3000,true);
		JOptionPane.showMessageDialog(null, "Pulsa ok");
	}

}

class Reloj{
	
	
	
	public void enMarcha(int intervalo, boolean sonido) {
		 class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora =new Date();
				System.out.println("Te pongo la hora cada 3 s"+ ahora);	
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		
			
		
	}
		ActionListener oyente=new DameLaHora2();
		Timer mitemporizador=new Timer(intervalo,oyente);
		mitemporizador.start();
	}
	
	
}