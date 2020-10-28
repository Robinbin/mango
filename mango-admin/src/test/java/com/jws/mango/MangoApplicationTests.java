package com.jws.mango;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//@SpringBootTest
public class MangoApplicationTests {

    //	@Test
    void contextLoads() {
    }

    @Test
    public void testJava8() {
        List<Apple> list = new ArrayList<>();
        Apple a1 = new Apple("Red", 12);
        Apple a2 = new Apple("Blue", 212);
        Apple a3 = new Apple("Yellow", 132);
        Apple a4 = new Apple("Black", 16);
        Apple a5 = new Apple("Green", 6);
        Apple a6 = new Apple("Pink", 26);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        System.out.println(getList(list, (apple) -> apple.getWeight() > 15));
        System.out.println(getList(list, (apple) -> apple.getName().equals("Yellow")));
        Assert.assertTrue(true);
    }

    private List<String> getList(List<Apple> apples, Predicate<Apple> p) {
        return apples.stream().filter(p).map(Apple::getName).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    private static class Apple {
        String name;
        int weight;

        public Apple(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

//    @Test
    public void genFile() {
        String fileName = "D:\\temp\\test.csv";
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF});
            fos.flush();

            BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName), StandardCharsets.UTF_8);
            writer.write("ァイウオガギゴザジスズセゼソダカチョウ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}