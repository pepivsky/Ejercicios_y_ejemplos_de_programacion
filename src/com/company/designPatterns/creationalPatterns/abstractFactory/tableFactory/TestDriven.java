package com.company.designPatterns.creationalPatterns.abstractFactory.tableFactory;


interface Table {
    String getTable();
}

class KitchenTable implements Table {
    @Override
    public String getTable() {
        return "There is a kitchen table";
    }
}

class OfficeTable implements Table {
    @Override
    public String getTable() {
        return  "There is an office table";
    }
}

// 2
interface TableTools {
    String getTool();
}

class KitchenTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are kitchen table tools";
    }
}

class OfficeTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are office table tools";
    }
}

// abstract factory
interface TableFactory {
    Table makeTable();
    TableTools makeTableTools();
}

class KitchenTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new KitchenTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new KitchenTableTool();
    }
}

class OfficeTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new OfficeTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new OfficeTableTool();
    }
}



public class TestDriven {
    public static void main(String[] args) throws InterruptedException {
        Table table;
        TableTools tableTools;

        TableFactory kitchenTableFactory = new KitchenTableFactory();
        TableFactory officeTableFactory = new OfficeTableFactory();

        System.out.println("-I work as a cook. I need a kitchen table");
        System.out.println("-Got It! Give me a sec,- Calling the KitchenTableFactory. - Bring me the KitchenTable with KitchenTableTools");
        Thread.sleep(5000);

        table = kitchenTableFactory.makeTable(); // lo mismo que table = new KitchenTable
        tableTools = kitchenTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!\n");
        Thread.sleep(5000);


        //
        System.out.println("-I am an office manager. I need an office table");
        System.out.println("-Got It! Give me a sec,- Calling the OfficeTableFactory. - Bring me the OfficeTable with OfficeTableTools");
        Thread.sleep(5000);

        table = officeTableFactory.makeTable();
        tableTools = officeTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!");
    }

}
