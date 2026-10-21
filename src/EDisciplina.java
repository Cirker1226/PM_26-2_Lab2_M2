/** 
 * MIT License
 *
 * Copyright(c) 2026 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * @author Joao Caram @joaocaram (caram@pucminas.br)
 * Utilização do @Copilot para geração de documentação JavaDoc, revisada.
 * 
 */

/**
 * Enumeração das disciplinas ministradas, cada uma com sua quantidade de horas-aula semanais.
 */
public enum EDisciplina {

	IAA(8),
	PROGMOD(8),
	ED(8),
	ARQCOMP(4),
	SO(4),
	DIW(2);

	private double horasAula;

	EDisciplina(double horas){
		horasAula = horas;
	}

	/**
	 * Retorna a quantidade de horas-aula semanais da disciplina.
	 *
	 * @return horas-aula semanais
	 */
	public double horasAula(){
		return  horasAula;
	}
}
