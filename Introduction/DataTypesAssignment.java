/*
 * Write programs to use all the data types and given arithmetic operations.
 * Write program to perform all the arithmetic operations given in the table.
 */
public class DataTypesAssignment {

	public static void main(String[] args) {
		

		// Write programs to use all the data types and given arithmetic operations.
		int i = 10, i1 = 20, ia, is, im, id, ii, iD, ii1, iD1;
		short s = 10, s1 = 5, sa, ss, sm, sd, si, sD, si1, sD1;
		byte b = 1, b1 = -1, ba, bs, bm, bd, bi, bD, bi1, bD1;
		long l = -20L, l1 = 40L, la, ls, lm, ld, li, lD, li1, lD1;
		float f = 20.9999F, f1 = 30.898F, fa, fs, fm, fd, fi, fD, fi1, fD1;
		double d = 40.66, d1 = 50.90, da, ds, dm, dd, di, dD, di1, dD1;
		char c = 'A', c1 = 'S', ca, cs, cm, cd, ci, cD, ci1, cD1;
		//boolean bo = true, bo1 = false, boa, bos, bom, bod, boi, boD, boi1, boD1;
		
		ia = i + i1;
		is = i - i1;
		im = i * i1;
		id = i / i1;
		ii = i++;
		iD = i--;
		ii1 = ++i;
		iD1 = --i;
		
		System.out.println("Integer Operation");
		System.out.printf("%d + %d = %d\n", i, i1, ia);
		System.out.printf("%d - %d = %d\n", i, i1, is);
		System.out.printf("%d * %d = %d\n", i, i1, im);
		System.out.printf("%d / %d = %d\n", i, i1, id);
		System.out.printf("%d++ = %d\n", i, ii);
		System.out.printf("%d-- = %d\n", i, iD);
		System.out.printf("++%d = %d\n", i, ii1);
		System.out.printf("--%d = %d\n", i, iD1);
		
		sa = (short) (s + s1);
		ss = (short) (s - s1);
		sm = (short) (s * s1);
		sd = (short) (s / s1);
		si = s++;
		sD = s--;
		si1 = ++s;
		sD1 = --s;
		
		System.out.println("Short Operation");
		System.out.printf("%d + %d = %d\n", s, s1, sa);
		System.out.printf("%d - %d = %d\n", s, s1, ss);
		System.out.printf("%d * %d = %d\n", s, s1, sm);
		System.out.printf("%d / %d = %d\n", s, s1, sd);
		System.out.printf("%d++ = %d\n", s, si);
		System.out.printf("%d-- = %d\n", s, sD);
		System.out.printf("++%d = %d\n", s, si1);
		System.out.printf("--%d = %d\n", s, sD1);
		
		ba = (byte) (b + b1);
		bs = (byte) (b - b1);
		bm = (byte) (b * b1);
		bd = (byte) (b / b1);
		bi = b++;
		bD = b--;
		bi1 = ++b;
		bD1 = --b;
		
		System.out.println("Byte Operation");
		System.out.printf("%d + %d = %d\n", b, b1, ba);
		System.out.printf("%d - %d = %d\n", b, b1, bs);
		System.out.printf("%d * %d = %d\n", b, b1, bm);
		System.out.printf("%d / %d = %d\n", b, b1, bd);
		System.out.printf("%d++ = %d\n", b, bi);
		System.out.printf("%d-- = %d\n", b, bD);
		System.out.printf("++%d = %d\n", b, bi1);
		System.out.printf("--%d = %d\n", b, bD1);
		
		la = l + l1;
		ls = l - l1;
		lm = l * l1;
		ld = l / l1;
		li = l++;
		lD = l--;
		li1 = ++l;
		lD1 = --l;
		
		System.out.println("Long Operation");
		System.out.printf("%d + %d = %d\n", l, l1, la);
		System.out.printf("%d - %d = %d\n", l, l1, ls);
		System.out.printf("%d * %d = %d\n", l, l1, lm);
		System.out.printf("%d / %d = %d\n", l, l1, ld);
		System.out.printf("%d++ = %d\n", l, li);
		System.out.printf("%d-- = %d\n", l, lD);
		System.out.printf("++%d = %d\n", l, li1);
		System.out.printf("--%d = %d\n", l, lD1);
		
		fa = f + f1;
		fs = f - f1;
		fm = f * f1;
		fd = f / f1;
		fi = f++;
		fD = f--;
		fi1 = ++f;
		fD1 = --f;
		
		System.out.println("Float Operation");
		System.out.printf("%.2f + %.2f = %.2f\n", f, f1, fa);
		System.out.printf("%.2f - %.2f = %.2f\n", f, f1, fs);
		System.out.printf("%.2f * %.2f = %.2f\n", f, f1, fm);
		System.out.printf("%.2f / %.2f = %.2f\n", f, f1, fd);
		System.out.printf("%.2f++ = %.2f\n", f, fi);
		System.out.printf("%.2f-- = %.2f\n", f, fD);
		System.out.printf("++%.2f = %.2f\n", f, fi1);
		System.out.printf("--%.2f = %.2f\n", f, fD1);
		
		da = d + d1;
		ds = d - d1;
		dm = d * d1;
		dd = d / d1;
		di = d++;
		dD = d--;
		di1 = ++d;
		dD1 = --d;
		
		System.out.println("Double Operation");
		System.out.printf("%.2f + %.2f = %.2f\n", d, d1, da);
		System.out.printf("%.2f - %.2f = %.2f\n", d, d1, ds);
		System.out.printf("%.2f * %.2f = %.2f\n", d, d1, dm);
		System.out.printf("%.2f / %.2f = %.2f\n", d, d1, dd);
		System.out.printf("%.2f++ = %.2f\n", d, di);
		System.out.printf("%.2f-- = %.2f\n", d, dD);
		System.out.printf("++%.2f = %.2f\n", d, di1);
		System.out.printf("--%.2f = %.2f\n", d, dD1);
		
		ca = (char) (c + c1);
		cs = (char) (c - c1);
		cm = (char) (c * c1);
		cd = (char) (c / c1);
		ci = c++;
		cD = c--;
		ci1 = ++c;
		cD1 = --c;
		
		System.out.println("Char Operation");
		System.out.printf("%c + %c = %c\n", c, c1, ca);
		System.out.printf("%c - %c = %c\n", c, c1, cs);
		System.out.printf("%c * %c = %c\n", c, c1, cm);
		System.out.printf("%c / %c = %c\n", c, c1, cd);
		System.out.printf("%c++ = %c\n", c, ci);
		System.out.printf("%c-- = %c\n", c, cD);
		System.out.printf("++%c = %c\n", c, ci1);
		System.out.printf("--%c = %c\n", c, cD1);
		
		
		
	}

}
