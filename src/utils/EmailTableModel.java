package utils;

import javax.swing.table.AbstractTableModel;

import data.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailTableModel extends AbstractTableModel {
    private List<Email> emails;
    private String[] colunas = { "E-mail", "Tipo de E-mail" };

    public EmailTableModel() {
        this.emails = new ArrayList<>();
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
        fireTableDataChanged();
    }

    public Email getEmailAt(int rowIndex) {
        return emails.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return emails.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Email email = emails.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return email.getEndereco();
            case 1:
                return email.getTipoEmail();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}