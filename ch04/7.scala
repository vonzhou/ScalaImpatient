/**
  * Created by vonzhou on 2018/12/22.
  */
val properties = System.getProperties()
var maxLen = 0
for ((k, _) <- properties) {
  maxLen = k.toString().length max maxLen
}
for ((k, v) <- properties) {
  if (k != "sun.boot.class.path") {
    printf(s"%${maxLen}s | %s\n", k, v)
  }
}
