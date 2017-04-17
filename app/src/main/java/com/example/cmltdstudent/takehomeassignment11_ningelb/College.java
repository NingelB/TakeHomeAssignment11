package com.example.cmltdstudent.takehomeassignment11_ningelb;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 4/17/17.
 */

public class College implements Serializable {


        public String name;
        public String info;
        public int photoId;

        public College (String name, String info, int photoId) {
            this.name = name;
            this.info = info;
            this.photoId = photoId;
        }

        public String getName()
        {
            return name;
        }


        public String getInfo() {
            return info;
        }


        public int getPhotoId() {
            return photoId;
        }


        @Override
        public String toString()
        {
            return name + "\n" + info + "\n"  + photoId;
        }

    }


