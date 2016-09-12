package Models;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gilberto León
 */
public class MemoryTableModel extends AbstractTableModel {
    
    private final int[] memoryCells = new int[110];
    private final String[] columnNames = {"", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    
    public MemoryTableModel() {
        this.setRowHeaders();
    }
    
    public MemoryTableModel(int[] memoryCells) {
        for (int i = 0; i < 109; i++) {
            if (i<=10) {
                this.memoryCells[i+1] = memoryCells[i];
            } else if (i>10 && i<=20) {
                this.memoryCells[i+1] = memoryCells[i-1];
            } else if (i>20 && i<=31) {
                this.memoryCells[i+1] = memoryCells[i-2];
            } else if (i>31 && i<=42) {
                this.memoryCells[i+1] = memoryCells[i-3];
            } else if (i>42 && i<=53) {
                this.memoryCells[i+1] = memoryCells[i-4];
            } else if (i>53 && i<=64) {
                this.memoryCells[i+1] = memoryCells[i-5];
            } else if (i>64 && i<=75) {
                this.memoryCells[i+1] = memoryCells[i-6];
            } else if (i>75 && i<=86) {
                this.memoryCells[i+1] = memoryCells[i-7];
            } else if (i>86 && i<=97) {
                this.memoryCells[i+1] = memoryCells[i-8];
            } else if (i>97 && i<=109) {
                this.memoryCells[i+1] = memoryCells[i-9];
            }
        }
        this.setRowHeaders();
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        
        if (rowIndex == 0) {
            value = this.memoryCells[columnIndex];
        } else if (rowIndex == 1) {
            value = this.memoryCells[columnIndex+11];
        } else if (rowIndex == 2) {
            value = this.memoryCells[columnIndex+22];
        } else if (rowIndex == 3) {
            value = this.memoryCells[columnIndex+33];
        } else if (rowIndex == 4) {
            value = this.memoryCells[columnIndex+44];
        } else if (rowIndex == 5) {
            value = this.memoryCells[columnIndex+55];
        } else if (rowIndex == 6) {
            value = this.memoryCells[columnIndex+66];
        } else if (rowIndex == 7) {
            value = this.memoryCells[columnIndex+77];
        } else if (rowIndex == 8) {
            value = this.memoryCells[columnIndex+88];
        } else if (rowIndex == 9) {
            value = this.memoryCells[columnIndex+99];
        }
        
        return value;
    }
    
    public void setMemoryCells(int[] memoryCells) {
        for (int i = 0; i < 109; i++) {
            if (i<=10) {
                this.memoryCells[i+1] = memoryCells[i];
            } else if (i>10 && i<=20) {
                this.memoryCells[i+1] = memoryCells[i-1];
            } else if (i>20 && i<=31) {
                this.memoryCells[i+1] = memoryCells[i-2];
            } else if (i>31 && i<=42) {
                this.memoryCells[i+1] = memoryCells[i-3];
            } else if (i>42 && i<=53) {
                this.memoryCells[i+1] = memoryCells[i-4];
            } else if (i>53 && i<=64) {
                this.memoryCells[i+1] = memoryCells[i-5];
            } else if (i>64 && i<=75) {
                this.memoryCells[i+1] = memoryCells[i-6];
            } else if (i>75 && i<=86) {
                this.memoryCells[i+1] = memoryCells[i-7];
            } else if (i>86 && i<=97) {
                this.memoryCells[i+1] = memoryCells[i-8];
            } else if (i>97 && i<=109) {
                this.memoryCells[i+1] = memoryCells[i-9];
            }
        }
        this.setRowHeaders();
        this.fireTableDataChanged();
    }
    
    private void setRowHeaders() {
        this.memoryCells[0] = 0;
        this.memoryCells[11] = 10;
        this.memoryCells[22] = 20;
        this.memoryCells[33] = 30;
        this.memoryCells[44] = 40;
        this.memoryCells[55] = 50;
        this.memoryCells[66] = 60;
        this.memoryCells[77] = 70;
        this.memoryCells[88] = 80;
        this.memoryCells[99] = 90;
    }
}