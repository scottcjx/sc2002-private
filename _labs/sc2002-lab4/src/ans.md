# Lab 4 QnA

## 3.1.1

Compilation error message 
``` bash
java: cannot find symbol
  symbol:   class SalePerson
  location: class WeeklySales
```

`SalePerson` in `WeeklySales` should be imported but `SalePerson` class does not exist as of yet.

## 3.1.2

> Solution: Modify the `int` datatype to `Integer`


## 3.1.4


> Solution: Create a new `SalePerson class`

```java

public class SalePerson implements Comparable<SalePerson> {
    private String name1;
    private String name2;
    private int staffId;

    public SalePerson(java.lang.String name1, java.lang.String name2, int staffId) {
        this.name1 = name1;
        this.name2 = name2;
        this.staffId = staffId;
    }
    public int compareTo(SalePerson sp)
    {
        return 0;
    }
}
```


