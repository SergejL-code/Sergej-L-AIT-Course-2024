package HomeWork_26.autoGmbH.Parts_warehouse;
/*Интерфейс Stock c методами:
    -добавить деталь на склад
    -найти деталь по barCode
    -обновить данные о детали
    -удалить деталь
    -общая масса всех деталей на складе
    -средняя масса деталей на складе

    Interface Stock with methods:
    -add a part to the warehouse
    -find a part by barCode
    -update data about the part
    -delete a part
    -total weight of all parts in the warehouse
    -average weight of parts in the warehouse*/

import HomeWork_26.autoGmbH.model.Detail;

public interface Stock {

    //methode
    boolean addPart(Detail detail);

    Detail findPart(long barCode);

    Detail updatePartStock(Detail detail);

    Detail removePart(long barCode);

    double totalWeightOfAllParts();

    double averageWeightOfParts();

    void printallDetail();

}//end  interface
