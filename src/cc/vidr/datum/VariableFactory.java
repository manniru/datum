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

package cc.vidr.datum;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides Variables for variable symbols.
 * 
 * @author  David Roberts
 */
public class VariableFactory {
    /** Mapping of symbols to variables */
    private Map<String, Variable> variables = new HashMap<String, Variable>();
    
    /**
     * Return the variable for the given symbol. The "_" symbol always returns
     * a new variable.
     * 
     * @param name  the symbol
     * @return      the variable
     */
    public Variable get(String name) {
        if(name.equals("_"))
            return new Variable();
        if(!variables.containsKey(name))
            variables.put(name, new Variable());
        return variables.get(name);
    }
}