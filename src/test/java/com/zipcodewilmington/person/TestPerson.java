package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedEducation = "";
        boolean expectedSwim = false;
        String expectedAddress = "";
        Integer expectedNumOfPets = Integer.MAX_VALUE;
        boolean expectedOwnPhone = false;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualEducation = person.getEducation();
        boolean actualSwim = person.getCanSwim();
        String actualAddress = person.getAddress();
        Integer actualNumOfPet = person.getNumOfPets();
        boolean actualOwnPhone = person.getOwnPhone();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEducation, actualEducation);
        Assert.assertEquals(expectedSwim, actualSwim);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedNumOfPets, actualNumOfPet);
        Assert.assertEquals(expectedOwnPhone, actualOwnPhone);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithEducation() {
        // Given
        String expected = "Associates";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getEducation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAddress() {
        // Given
        String expected = "1234 north philly";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithCanSwim() {
        // Given
        boolean expected = true;

        // When
        Person person = new Person(expected);

        // Then
        boolean actual = person.getCanSwim();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithOwnPhone() {
        // Given
        boolean expected = true;

        // When
        Person person = new Person(expected);

        // Then
        boolean actual = person.getOwnPhone();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithNumOfPets() {
        // Given
        int expected = 3;

        // When
        Person person = new Person(expected);

        // Then
        int actual = person.getNumOfPets();
        Assert.assertEquals(expected, actual);
    }
}
