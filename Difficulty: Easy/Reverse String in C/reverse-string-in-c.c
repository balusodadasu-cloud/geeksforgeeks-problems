void reverseString(char str[]) {
    // code here
    int len = strlen(str);
        char c[len];
        int i, j;
        for(i = len-1,j=0;j<len;j++, i--)
            c[j] = str[i];
        c[j] = '\0';
    printf("%s",c);
}