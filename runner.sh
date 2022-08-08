for FILE in programmes/*.java 
do 
    echo ""
    echo "---------"
    echo $(basename $(basename $FILE programmes/) .java)
    echo "--------"
    javac $FILE
    cd programmes
    java $(basename $FILE .java)
    echo "----------------------"
done
