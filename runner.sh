for FILE in programmes/*.java 
do 
    echo ""
    echo "======================"
    echo $(basename $(basename $FILE programmes/) .java)
    echo "----------------------"
    
    if ! [[ -d programmes/compilations/$(basename $(basename $FILE programmes/) .java) ]]
    then
        mkdir programmes/compilations/$(basename $(basename $FILE programmes/) .java)
    fi

    javac -d programmes/compilations/$(basename $(basename $FILE programmes/) .java) $FILE

    cd programmes/compilations/$(basename $(basename $FILE programmes/) .java)
    java $(basename $FILE .java)
    echo "======================"
done
