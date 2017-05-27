/** Class that represents an angle in deg.
 */
class Angle {

  float angle ;

  /** Dedicated constructor, initialize with angle a.
   * @param a The angle to be stored internally.
   * */
  Angle(float a) {
    this.angle = a ;
  }
  
  /** 
   * Vergleicht die Referenzen der beiden Objekte.
   * @param other Winkel mit dem dieser verglichen werden soll
   * @return Wahr, wenn Referenzen gleich
   */
  boolean isSameObject(Angle other) {
    // durch eigenen code ersetzen!
    return this == other;
    
  }

  /**
   * Vergleicht die Werte der Instanzen.
   * @param other Winkel mit dem dieser verglichen werden soll
   * @return Wahr, wenn beide in die selbe Richtung zeigen, sonst falsch
   */
  boolean isSameValue(Angle other) {
    return (360 + this.angle) % 360 == (360 + other.angle) % 360;
  }
}