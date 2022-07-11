
package tycs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "a",
    "b"
})
public class Add {

    protected float a;
    protected float b;

    /**
     * Gets the value of the a property.
     * 
     */
    public float getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     */
    public void setA(float value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     */
    public float getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     */
    public void setB(float value) {
        this.b = value;
    }

}
