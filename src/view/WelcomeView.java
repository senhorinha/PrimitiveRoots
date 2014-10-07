/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.math.BigInteger;
import java.util.List;

import model.NotPrimeException;
import model.PrimitiveRootCalculator;

/**
 *
 * @author thiago
 */
public class WelcomeView extends javax.swing.JFrame {


	public WelcomeView() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		inputPanel = new javax.swing.JPanel();
		primitiveRootLabel = new javax.swing.JLabel();
		inputPrimitiveTextField = new javax.swing.JTextField();
		calculateButton = new javax.swing.JButton();
		resultsPanel = new javax.swing.JPanel();
		resultsScrollPanel = new javax.swing.JScrollPane();
		resultsList = new java.awt.List();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		exitMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		aboutMenuItem = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Primitive Root Calculator");
		setResizable(false);

		inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input panel"));
		inputPanel.setToolTipText("");

		primitiveRootLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		primitiveRootLabel.setForeground(new java.awt.Color(1, 1, 1));
		primitiveRootLabel.setText("Primitive root modulo n");

		calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/calculate.png"))); // NOI18N
		calculateButton.setToolTipText("Calculate");
		calculateButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				calculateButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
		inputPanel.setLayout(inputPanelLayout);
		inputPanelLayout.setHorizontalGroup(inputPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(inputPrimitiveTextField)
				.addGroup(
						inputPanelLayout
								.createSequentialGroup()
								.addGroup(
										inputPanelLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														inputPanelLayout.createSequentialGroup().addGap(46, 46, 46)
																.addComponent(primitiveRootLabel))
												.addGroup(
														inputPanelLayout.createSequentialGroup().addGap(114, 114, 114)
																.addComponent(calculateButton)))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		inputPanelLayout.setVerticalGroup(inputPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				inputPanelLayout
						.createSequentialGroup()
						.addContainerGap(18, Short.MAX_VALUE)
						.addComponent(primitiveRootLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inputPrimitiveTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(calculateButton)));

		resultsScrollPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Results"));

		resultsScrollPanel.setViewportView(resultsList);

		javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
		resultsPanel.setLayout(resultsPanelLayout);
		resultsPanelLayout.setHorizontalGroup(resultsPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(resultsScrollPanel,
				javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE));
		resultsPanelLayout.setVerticalGroup(resultsPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				resultsPanelLayout
						.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(resultsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		fileMenu.setMnemonic('f');
		fileMenu.setText("File");

		exitMenuItem.setMnemonic('x');
		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		helpMenu.setMnemonic('h');
		helpMenu.setText("Help");

		aboutMenuItem.setMnemonic('a');
		aboutMenuItem.setText("About");
		aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aboutMenuButtonActionPerformed(evt);
			}
		});
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}// GEN-LAST:event_exitMenuItemActionPerformed

	private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calculateButtonActionPerformed
		if (validateInputNumber()) {
			try {
				List<BigInteger> result = PrimitiveRootCalculator.calculate(new BigInteger(
						this.inputPrimitiveTextField.getText()));
				this.resultsList.clear();
				for (BigInteger primitiveRoots : result) {
					resultsList.add(String.valueOf(primitiveRoots.intValue()));
				}
			} catch (NotPrimeException e) {
				NotPrimeDialog notPrimeDialog = new NotPrimeDialog(this, false);
				notPrimeDialog.setLocationRelativeTo(this);
				notPrimeDialog.setVisible(true);
			}
		}
	}// GEN-LAST:event_calculateButtonActionPerformed

	private void aboutMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {
		AboutDialog aboutDialog = new AboutDialog(this, false);
		aboutDialog.setLocationRelativeTo(this);
		aboutDialog.setVisible(true);
	}

	private boolean validateInputNumber() {
		return Validador.validarInteiro(inputPrimitiveTextField, primitiveRootLabel);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JButton calculateButton;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JPanel inputPanel;
	private javax.swing.JTextField inputPrimitiveTextField;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel primitiveRootLabel;
	private java.awt.List resultsList;
	private javax.swing.JPanel resultsPanel;
	private javax.swing.JScrollPane resultsScrollPanel;
	// End of variables declaration//GEN-END:variables

}
