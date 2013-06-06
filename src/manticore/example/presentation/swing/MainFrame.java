/*
 */
package manticore.example.presentation.swing;

import manticore.example.business.controllers.ExampleController;
import manticore.example.business.events.EventFired;
import manticore.presentation.SwingController;
import manticore.presentation.annotation.Listen;

/**
 *
 * @author hector
 */
public class MainFrame extends javax.swing.JFrame
{
    ExampleController exampleController;
    int eventsFired = 0;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame(SwingController swing)
    {
        initComponents();
        
        exampleController = swing.getBusinessController(ExampleController.class);
    }
    
    /**
     * This method listens the event: EventFired, and it gets called every time the business layer
     * fires that event.
     */
    @Listen(EventFired.class)
    public void eventFired()
    {
        eventsFired++;
        eventsFiredLabel.setText(String.valueOf(eventsFired));
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        fireEventButoon = new javax.swing.JButton();
        eventLabel = new javax.swing.JLabel();
        eventsFiredLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manticore example");

        fireEventButoon.setText("Fire event");
        fireEventButoon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fireEventButoonActionPerformed(evt);
            }
        });

        eventLabel.setText("Events fired:");

        eventsFiredLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fireEventButoon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eventLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventsFiredLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventLabel)
                    .addComponent(eventsFiredLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fireEventButoon)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fireEventButoonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fireEventButoonActionPerformed
    {//GEN-HEADEREND:event_fireEventButoonActionPerformed
        exampleController.fireEvent(); // The business controller fires an event
    }//GEN-LAST:event_fireEventButoonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eventLabel;
    private javax.swing.JLabel eventsFiredLabel;
    private javax.swing.JButton fireEventButoon;
    // End of variables declaration//GEN-END:variables
}