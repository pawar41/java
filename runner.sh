for FILE in programmes/*.java 
do 
    echo ""
    echo "---------"
    echo $FILE
    echo "--------"
    javac $FILE
    cd programmes
    java $(basename $FILE .java)
    echo "----------------------"
done
