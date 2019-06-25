package com.application.zomato.starter.data

import com.google.gson.annotations.SerializedName

class SampleModel {
      /**
       * {
       *    "key1" : "value1",
       *    "key2" : "value2"
       * }
       */
      @SerializedName("key1") var value1 : String? = ""
      @SerializedName("key2") var value2 : Int? = 0
}