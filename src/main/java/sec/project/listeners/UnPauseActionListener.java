package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UnPauseActionListener implements ActionListener {
	private JTable table;
	private JButton pause;
	private JButton unpause;

	public UnPauseActionListener(JTable table, JButton pause, JButton unpause) {
		this.table = table;
		this.pause = pause;
		this.unpause = unpause;
	}

	public void actionPerformed(ActionEvent evt) {
		unpauseActionPerformed(evt);
	}

	private void unpauseActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i = table.getSelectedRow();
		JOptionPane.showInputDialog("Enter Password");
		Object s = "Unpaused";
		model.setValueAt((Object) s, i, 1);
		pause.setEnabled(true);
		unpause.setEnabled(false);
	}
}
