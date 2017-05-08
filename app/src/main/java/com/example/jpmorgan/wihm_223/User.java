package com.example.jpmorgan.wihm_223;

/**
 * Created by jpmorgan on 3/27/17.
 */


//Prim key UUID --> Firebase

public class User {

        private String uid, name, age, weight, length;
        private Object heartrates;
        public User(){
        }

        public User(String uid, String name, String age, String weight, String length) {
            this.uid = uid; //Primaire key
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.length = length;
            // this.heartrates = heartrates;

        }

       // public Object getHeartrates(){ return heartrates; }
       // public Object setHeartrates(Object heartrates){ this.heartrates = heartrates})
        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }
}
