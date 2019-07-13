#include <jni.h>


JNIEXPORT jint JNICALL Java_com_example_ndktest_MainActivity_addInJNI(JNIEnv * env, jobject obj,jint a, jint b) {
    return (a+b);
}

