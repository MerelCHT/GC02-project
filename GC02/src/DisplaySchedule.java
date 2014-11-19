import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class DisplaySchedule {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Object rowData[][] = { { "185S33MB26" ,"27","CRFTDEP","01-JAN-01 00.00.00","26-OCT-14 07.56.00","01-JAN-01 00.00.00","01-JAN-01 00.00.00","01-JAN-01 00.00.00" },
	    					   { "185S33MB26","27","CRFTESP","26-OCT-14 08.03.00","26-OCT-14 08.08.00","01-JAN-01 00.00.00","01-JAN-01 00.00.00","01-JAN-01 00.00.00" } };
	    Object columnNames[] = { "UWTTID","SECTOR","LOCATION","PLANNED ARRIVAL","PLANNED DEPARTURE","PLANNED PASS","ACTUAL ARRIVAL","ACTUAL DEPARTURE"};
	    JTable table = new JTable(rowData, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(1500, 500);
	    frame.setVisible(true);
	}
	
	 
}
