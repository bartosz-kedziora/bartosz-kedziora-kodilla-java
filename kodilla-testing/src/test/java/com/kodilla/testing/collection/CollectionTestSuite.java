package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection test Suite")
class CollectionTestSuite
{
    private String methodName;
    public String getMethodName()
    {
        return methodName;
    }

    public void setMethodName(String methodName)
    {
        this.methodName = methodName;
    }

    @BeforeEach
    public void before()
    {
        System.out.println("Test begin");
    }

    @AfterEach
    public void after()
    {
        System.out.println("Test end");
    }

    @DisplayName("A test to check if a class behaves correctly when the list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        setMethodName(new Throwable().getStackTrace()[0].getMethodName());
        System.out.println(getMethodName());
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> oddNumbers = new ArrayList<>();
        System.out.println("Testing, List is empty");
        //Then
        Assertions.assertNull(oddNumbersExterminator.exterminate(oddNumbers));
    }

    @DisplayName("A test to check if a class behaves correctly when the list contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList()
    {
        setMethodName(new Throwable().getStackTrace()[0].getMethodName());
        System.out.println(getMethodName());
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> allNumbers;
        Integer[] a = new Integer[] {7,8};
        allNumbers = Arrays.asList(a);
        allNumbers=oddNumbersExterminator.exterminate(allNumbers);
        System.out.println("Testing, List contain odd number: 8");
        //Then
        Assertions.assertEquals(8,allNumbers.get(0));
    }
}
