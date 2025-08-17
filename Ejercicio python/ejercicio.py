import os 
from pathlib import PurePath
def buscarDirectorio(ruta:str):
    try: 
        ficheros=os.scandir(ruta)
        for fichero in ficheros: 
            if fichero.is_dir():
                buscarDirectorio(fichero.path)
            else: 
                if PurePath(fichero.path).match("*.txt"):
                    print(fichero.name)
                    archivo=open(fichero.path)
                    lineas=archivo.readlines()
                    cantidadLineas=len(lineas)
                    totalPalabras=0
                    totalCaracteres=0
                    for linea in lineas: 
                        palabras=linea.split()
                        cantidadPalabras=len(palabras)
                        totalPalabras+=cantidadPalabras
                        for palabra in palabras: 
                            caracteres=len(palabra)
                            totalCaracteres+=caracteres
                    print(f"{fichero.name}\t {cantidadLineas}\t {totalPalabras}\t {totalCaracteres}")
    except Exception:
        print("error")
ruta = input("Ingrese la ruta: ")
print("------------------------")
print("nombre del archivo \t cantidad de lineas \t cantidad de palabras \t cantidad de caracteres")
buscarDirectorio(ruta)