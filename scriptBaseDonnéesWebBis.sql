CREATE SCHEMA `buymyperipheraldb` DEFAULT CHARACTER SET utf8 ;

create table utilisateur (
	login varchar(20),
	motDePasse varchar(20) not null,
	nom varchar(20) not null,
	prenom varchar(20) not null,
	dateNaissance date not null,
	rueAdr varchar(50) not null,
	localiteAdr varchar(50) not null,
	email varchar(50) not null,
	telephone varchar(13) not null,
	typeUtilisateur varchar(20) not null,
	sexe varchar(1),
	fax varchar(20),
	primary key(login)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table commande (
 	numCommande integer,
	dateCommande date not null,
	paye bit not null,
	login varchar(20) not null,
	primary key(numCommande),
	constraint co_login_fk foreign key(login) references utilisateur(login)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table categorie (
	codeCategorie integer,
	primary key(codeCategorie)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table promotion (
	code integer,
	dateDebutValidite date not null,
	dateFinValidite date not null,
	pourcentagePromotion numeric (3,2) not null,
	codeCategorie integer,
	primary key(code),
	constraint pr_codeCategorie_fk foreign key(codeCategorie) references categorie(codeCategorie)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table langue (
	langageId integer,
	primary key(langageId)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table traductionCategorie (
	codeCategorie integer,
	langageId integer,
	nom varchar(50) not null,
	primary key(codeCategorie, langageId),
	constraint tc_codeCategorie_fk foreign key(codeCategorie) references categorie(codeCategorie),
	constraint tc_langageId_fk foreign key(langageId) references langue(langageId)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table produit (
	numReference integer,
	prixUnitaire numeric(5,2) not null,
	notation integer,
	marque varchar(50) not null,
	description varchar(100),
	codeCategorie integer,
	primary key(numReference),
	constraint po_codeCategorie_fk foreign key(codeCategorie) references categorie(codeCategorie),
	check(prixUnitaire > 0)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table traductionProduit (
	langageId integer,
	numReference integer,
	libelle varchar(50) not null,
	primary key(numReference, langageId),
	constraint tp_numReference_fk foreign key(numReference) references produit(numReference),
	constraint tp_langageId_fk foreign key(langageId) references langue(langageId)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table ligneCommande (
	numLigne integer,
	prixReel numeric(5,2) not null,
	quantite integer not null,
	numReference integer,
	numCommande integer,
	primary key(numLigne),
	constraint lc_dateCommande_fk foreign key(numCommande) references commande(numCommande),
	constraint lc_numReference_fk foreign key(numReference) references produit(numReference),
	check(prixReel > 0),
	check(quantite >= 0)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;