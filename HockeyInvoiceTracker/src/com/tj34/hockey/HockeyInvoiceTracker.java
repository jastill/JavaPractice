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
	
	// This is where the instance variables are.
	// The invoices are stored in an Array. This may want to be replaced
	// by a Map or Dictionary.
	private Invoice invoices[];

	/**
	 * This is the default Constructor. It loads the existing invoices.
	 */
	public HockeyInvoiceTracker() {
		loadInvoices();
	}

	/**
	 * This method is used to list the invoices on the terminal.
	 * It should loop through each of the Invoices and print the details.
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
	 * Show the menu
	 */
	private void showMenu() {
		// TODO: Add the code here that shows the menu and 
	}
	
	/**
	 * This method is used to run in a loop looking for input from the user.
	 * The method should validate the commands and execute the valid ones.
	 */
	public void run() {
		// Entry point for the project. This is where everything starts
		Scanner keyboard = new Scanner (System.in);
		
		// Show the menu
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
					// TJ to add this
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
	 * Main method for the application
	 * @param args
	 */
	public static void main(String[] args) {
		HockeyInvoiceTracker tracker = new HockeyInvoiceTracker();
		tracker.run();
	}
	
	/**
	 * Load the invoices file if it exists.
	 */
	private Boolean loadInvoices() {
		String filename = "HockeyInvoices.dat";

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
			fis = new FileInputStream(filename);
	        in = new ObjectInputStream(fis);
	        
			// Read the length as the first item
			// This lets us know how many invoices to load
	        Integer length = (Integer) in.readObject();
			
			// Create an array for the invoices that is big enough for the number
			// of invoices
	        invoices = new Invoice[length];
			
			// Read each invoice from the file and add it to the array
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
			// This is so that when we open the file again, we know
			// how many invoices to load.
	        Integer length = invoices.length;
	        
			out.writeObject(length);
			
			// Now write each valid invoice to the file
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
	 * Validate the selection made by the user.
	 */
	private Boolean isValidSelection(int selection) {
		// TJ TODO 
		return true;
	}
}
