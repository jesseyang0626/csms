package org.nocoder.csmc.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SellFrame extends JFrame {

	private static final long serialVersionUID = 7806680704413478071L;

	public SellFrame() {
		this.setTitle("销售管理");
		this.setSize(780, 480);
		this.setLocationRelativeTo(null);

		this.setContentPane(createContentPane());
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());

		pane.add(BorderLayout.NORTH, createInputPane());

		pane.add(BorderLayout.CENTER, createTablePane());

		pane.add(BorderLayout.SOUTH, new JLabel("蓝氏服装销售管理系统V1.0 - 版权所有，盗版必究", JLabel.RIGHT));

		return pane;
	}

	private JPanel createInputPane() {
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputPanel.add(new JTextField());
		inputPanel.add(new JTextField());
		inputPanel.add(new JTextField());
		return inputPanel;
	}

	private JPanel createTablePane() {
		JPanel tablePane = new JPanel(new FlowLayout());
		JTable table = new JTable();
		table.setTableHeader(new JTableHeader(new TableColumnModel() {

			@Override
			public void setSelectionModel(ListSelectionModel newModel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setColumnSelectionAllowed(boolean flag) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setColumnMargin(int newMargin) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeColumnModelListener(TableColumnModelListener x) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeColumn(TableColumn column) {
				// TODO Auto-generated method stub

			}

			@Override
			public void moveColumn(int columnIndex, int newIndex) {
				// TODO Auto-generated method stub

			}

			@Override
			public int getTotalColumnWidth() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListSelectionModel getSelectionModel() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int[] getSelectedColumns() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getSelectedColumnCount() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Enumeration<TableColumn> getColumns() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean getColumnSelectionAllowed() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int getColumnMargin() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getColumnIndexAtX(int xPosition) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getColumnIndex(Object columnIdentifier) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public TableColumn getColumn(int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addColumnModelListener(TableColumnModelListener x) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addColumn(TableColumn aColumn) {
				// TODO Auto-generated method stub

			}
		}));
		tablePane.add(table);
		return tablePane;
	}

}
