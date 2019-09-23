/**
 * TJ Hockey Invoices
 */

package com.tj34.hockey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author taylo
 *
 */
public class HockeyInvoiceTracker {
	
	private Invoice invoices[] = new Invoice[500];

	/**
	 * 
	 */
	public HockeyInvoiceTracker() {
		// TODO Load Invoices from file
		
		loadInvoices();
	}

	/**
	 * 
	 */
	private void showInvoices() {
		for (int i=0; i<invoices.length; i++) {
			Invoice invoice = invoices[i];
			
			if (invoice != null) {
				System.out.println(invoice.getGameDate() + ": "+ invoice.getGameFee());
			}
		}
	}
	
	/**
	 * 
	 */
	public void run() {
		// Entry point for the project. This is where everything starts
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Welcome to TJs Hockey Invoice Tracker");
		System.out.println("Select a number to continue:");
		System.out.println("[1] Show Invoices");
		System.out.println("[2] Update an Invoice");
		System.out.println("[3] Save Invoices");
		System.out.println("[4] Load Invoices");
		System.out.println("[9] Exit");
		
		while (true) {
			// Read the selection from keyboard
			int selection = keyboard.nextInt();

			if (this.isValidSelection(selection) == true) {
				// When you learn switch/case replace the if statements
				if (selection == 1) {
					this.showInvoices();
				} else if (selection == 2) {
					// TODO
				} else if (selection == 3) {
					saveInvoices();
				} else if (selection == 4) {
					loadInvoices();
				} else if (selection == 9) {
					keyboard.close();
					System.out.println("Goodbye");
					System.exit(0);
				}
			} else {
				System.out.println("Selection "+selection+" is not a valid choice");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HockeyInvoiceTracker tracker = new HockeyInvoiceTracker();
		tracker.run();
	}
	
	/**
	 * 
	 */
	private Boolean loadInvoices() {
		String filename = "HockeyInvoices.dat";

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
			fis = new FileInputStream(filename);
	        in = new ObjectInputStream(fis);
	        
	        // Write the length as the first item
	        Integer length = (Integer) in.readObject();
	        
	        invoices = new Invoice[length + 5];
	        
			for (int i = 0; i < length; i++) {
				Invoice invoice = (Invoice)in.readObject();
				invoices[i] = invoice;
			}
			in.close();
			
			System.out.println("Invoices Loaded: "+length);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        
		return true;
	}

	/**
	 * Save the invoices to a file.
	 */
	private Boolean saveInvoices() {
		String filename = "HockeyInvoices.dat";

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
			fos = new FileOutputStream(filename);
	        out = new ObjectOutputStream(fos);
	        
	        // Write the length as the first item
	        Integer length = invoices.length;
	        
	        out.writeObject(length);
			for (int i = 0; i < invoices.length; i++) {
				Invoice invoice = invoices[i];
				if (invoice != null) {
					out.writeObject(invoice);
				}
			}
			out.close();  		
		
			System.out.println("Invoices Saved: "+length);

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        
		return true;
	}
	
	/**
	 * 
	 */
	private Boolean isValidSelection(int selection) {
		// TJ TODO 
		return true;
	}
	
}
