import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    /**
     * Menambahkan komputer ke array
     * 
     * @param computer objek Computer
     */
    public void addComputer(Computer computer) {
        // Tambahkan komputer ke list
        this.list.add(computer);


    }

    /**
     * Menyalakan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOnMonitor
     */
    public void turnOnAllMonitors() {
        // Lengkapi turnOnAllMonitors
        for (Computer computer : list) {
            if (computer instanceof Monitor) {
                Monitor monitor = (Monitor) computer;
                monitor.turnOnMonitor();
            }
        }


    }

    /**
     * Mematikan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOffMonitor
     */
    public void turnOffAllMonitors() {
        // Lengkapi turnOffAllMonitors
        for (Computer computer : list) {
            if (computer instanceof Monitor) {
                Monitor monitor = (Monitor) computer;
                monitor.turnOffMonitor();
            }
        }

    }

    /**
     * Mencetak spesifikasi semua komputer
     * dengan metode printSpecification
     */
    public void printAllSpecifications() {
        // Lengkapi printAllSpecifications
        for (Computer computer : list) {
            computer.printSpecification();
        }

        
    }

    /**
     * Memindahkan semua komputer yang portable
     * dengan metode move
     */
    public void moveAllPortableComputers() {
        // Lengkapi moveAllPortableComputers
        for (Computer computer : list) {
            if (computer instanceof Portable) {
                Portable portable = (Portable) computer;
                portable.move();
            }
        }

        
    }

    /**
     * Menggunakan keyboard semua komputer yang memiliki keyboard
     * dengan metode useKeyboard
     */
    public void useAllKeyboards() {
        // Lengkapi useAllKeyboards
        for (Computer computer : list) {
            if (computer instanceof Keyboard) {
                Keyboard keyboard = (Keyboard) computer;
                keyboard.useKeyboard();
            }
        }

        
        
    }

}
