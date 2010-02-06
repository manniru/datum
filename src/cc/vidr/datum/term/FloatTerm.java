/*
 * Copyright (C) 2010  David Roberts <d@vidr.cc>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.vidr.datum.term;

/**
 * A floating point numerical term.
 * 
 * @author  David Roberts
 */
public class FloatTerm extends AbstractConstant<Double> implements Constant {
    private static final long serialVersionUID = -7303121431193300997L;
    
    /**
     * Create a new term with the given value.
     * 
     * @param value  the value of the term
     */
    public FloatTerm(double value) {
        super(value);
    }
    
    /**
     * Create a new term with the given value.
     * 
     * @param value  the value of the term
     */
    public FloatTerm(Number value) {
        this(value.doubleValue());
    }
    
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o instanceof FloatTerm) {
            FloatTerm f = (FloatTerm) o;
            return data.equals(f.data);
        }
        return false;
    }
    
    public String toString() {
        return data.toString();
    }
}
