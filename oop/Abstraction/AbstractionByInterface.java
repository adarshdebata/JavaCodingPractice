// Interface representing a Printer
interface Printer {
    // Abstract method (to be implemented by all types of printers)
    void print(String document);

    // Abstract method to show printer status
    void showStatus();
}

// Class representing an Inkjet Printer
class InkjetPrinter implements Printer {
    private final boolean hasInk;

    // Constructor to initialize ink status
    public InkjetPrinter(boolean hasInk) {
        this.hasInk = hasInk;
    }

    // Implementing the print method from the Printer interface
    @Override
    public void print(String document) {
        if (hasInk) {
            System.out.println("Inkjet Printer is printing: " + document);
        } else {
            System.out.println("Inkjet Printer is out of ink! Please refill.");
        }
    }

    // Implementing the showStatus method from the Printer interface
    @Override
    public void showStatus() {
        if (hasInk) {
            System.out.println("Inkjet Printer status: Ready to print.");
        } else {
            System.out.println("Inkjet Printer status: Out of ink.");
        }
    }
}

// Class representing a Laser Printer
class LaserPrinter implements Printer {
    private final boolean hasToner;

    // Constructor to initialize toner status
    public LaserPrinter(boolean hasToner) {
        this.hasToner = hasToner;
    }

    // Implementing the print method from the Printer interface
    @Override
    public void print(String document) {
        if (hasToner) {
            System.out.println("Laser Printer is printing: " + document);
        } else {
            System.out.println("Laser Printer is out of toner! Please refill.");
        }
    }

    // Implementing the showStatus method from the Printer interface
    @Override
    public void showStatus() {
        if (hasToner) {
            System.out.println("Laser Printer status: Ready to print.");
        } else {
            System.out.println("Laser Printer status: Out of toner.");
        }
    }
}

// Main class to demonstrate interface implementation
public class AbstractionByInterface {
    public static void main(String[] args) {
        // Creating an Inkjet Printer object with ink
        Printer inkjetPrinter = new InkjetPrinter(true);
        inkjetPrinter.showStatus();
        inkjetPrinter.print("Document1.pdf");

        System.out.println();

        // Creating a Laser Printer object without toner
        Printer laserPrinter = new LaserPrinter(false);
        laserPrinter.showStatus();
        laserPrinter.print("Report.docx");
    }
}
