package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;
public class PruebaTemporizador  {

	
	
	public static void main(String[] args) {
	
		DameLaHora oyente= new DameLaHora();
		
		Timer mitemporizador=new Timer(5000,oyente);
		
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa ok para detener");
		JOptionPane.showMessageDialog(null, "Pulsa ok");
	}

}

class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Date ahora=new Date();
		System.out.println("Te pongo la hora cada 5 segundos " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
