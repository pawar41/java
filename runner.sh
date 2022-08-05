for FILE in programmes/*.java 
do 
    echo ""
    echo $FILE
    java $FILE
    echo "---------"
done
