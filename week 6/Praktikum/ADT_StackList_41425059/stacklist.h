/*  Nama  : Putri Yuni Br Situmorang 
    Nim   :  41425059
    Prodi : D-IV TRPL */


#ifndef STACKLIST_H          /* Guard agar header tidak di-include 2x */
#define STACKLIST_H

#include <stdio.h>           /* Untuk printf, scanf */
#include <stdlib.h>          /* Untuk malloc, free, NULL */


#define Nil NULL             /* Nil adalah alias dari NULL */
#define Top(S) (S).Top       /* Makro untuk mengakses field Top dari StackList */
#define Count(S) (S).count   /* Makro untuk mengakses field count dari StackList */
#define Info(P) (P)->Info    /* Makro untuk mengakses field Info dari node */
#define Next(P) (P)->Next    /* Makro untuk mengakses field Next dari node */


typedef int Infotype;                    /* Tipe info yang disimpan di node (bisa diganti char, dll) */
typedef struct tElmtlist *address;       /* address = pointer ke tElmtlist */

/* Struktur node (elemen) linked list */
typedef struct tElmtlist {
    Infotype Info;      /* Menyimpan nilai/informasi elemen */
    address Next;       /* Pointer ke node berikutnya */
} ElmtList;

/* Struktur Stack yang membungkus linked list */
typedef struct {
    address Top;        /* Pointer ke node paling atas (elemen terakhir yang di-push) */
    int count;          /* Jumlah elemen dalam stack */
} StackList;

/* ---------- Prototipe Fungsi ---------- */
address Alokasi(Infotype X);              /* Alokasi node baru */
void CreateEmptyStack(StackList *S);      /* Membuat stack kosong */
void Destroy(StackList *S);               /* Menghapus seluruh isi stack */
int IsStackEmpty(StackList S);            /* Cek apakah stack kosong */
void Push(StackList *S, Infotype v);      /* Menambah elemen ke atas stack */
void Pop(StackList *S, Infotype *v);      /* Mengambil elemen dari atas stack */

#endif