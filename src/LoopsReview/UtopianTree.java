package LoopsReview;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 1;
        int size = 1;
        int growth=1;
        do{
            System.out.println("year "+ year+" -growth "+ "cm");
            System.out.println("tree size: "+ size + " cm");
            if (year < 3) {
                size ++;
            } else {
                size += 2;
                growth=2;
            }
        }while(year++ <10);



/*

        for (int i = 0; i < 10; i++) {
            year++;
            if (year <= 3) {
                size += 1;
            } else {
                size += 2;
            }
            System.out.println("year:" + year);
            System.out.println("tree size:"+size);
        }*/

    }
}

/*
### Use a `loop` to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.

```
Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year
```

Main topics: loops, primitive datatypes, operators, concatenation, if statements

Example Flow:
```
year 1 - growth 1 cm
tree size: 1 cm

year 2 - growth 1 cm
tree size: 2 cm

year 3  - growth 1 cm
tree size: 3 cm

year 4 - growth 2 cm
tree size: 5 cm

year 5 - growth 2 cm
tree size: 7 cm

year 6 - growth 2 cm
tree size: 9 cm

... until you reach year 10
```
 */
